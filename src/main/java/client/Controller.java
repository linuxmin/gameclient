package client;

import javax.ws.rs.core.Response;
import java.awt.*;
import java.util.concurrent.TimeoutException;

import static java.lang.Integer.parseInt;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        initView();
    }

    public void initView(){
        view.newGameScreen();

    }

    public void initController(){
        view.getNewgame().addActionListener(e -> initPlayerNoView()); //using lambdas to have nice and short code :)
        view.getPlayerone().addActionListener(e -> initRegisterPlayerViewOne());
        view.getPlayertwo().addActionListener(e -> initRegisterPlayerViewTwo());
        view.getRegisterplayer().addActionListener(e -> initReadyGameView());
    }

    public void initMapGeneration(){
        GETReadyGame getReadyGame = new GETReadyGame();
        Integer player_id = model.getPlayer().getPlayer_id();
        if(getReadyGame.getGameStatus(player_id).getStatus() == 417){ //TODO: error handling!
            System.out.println("Fuck");
        }
        Integer time = 0;
        Boolean timedout = false;
        while(!timedout){
            time = time +1;
            //every second the client asks if game is ready
            // if second player needs more than 20 seconds for registering, the new game view will be shown
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            if(time==20){
               // System.out.println("10 Seconds over!");
                timedout = true;
                break;
            }
        }
        if(!timedout) {
            view.newGameScreen();
        }else{
            model.generateMap();       //model generates the map
            initMapView();
        }
    }

    public void initMapView(){
        POSTMapTiles postMapTiles = new POSTMapTiles();
        GETFullMap getFullMap = new GETFullMap();
        TileList tileList = model.getTileList();
        TileList otherplayertiles = new TileList();
        Response response = postMapTiles.registerMapXML(tileList);
        if(response.getStatus() == 200){
            Integer time = 0;
            Boolean timedout = false;
            System.out.println(model.getPlayer().getMap_id() + " MapID");
            while(!timedout){
                time = time +1;
                //every second the client asks if game is ready
                // if second player needs more than 20 seconds for registering, the new game view will be shown
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                if(time==20){
                    // System.out.println("10 Seconds over!");
                    timedout = true;
                    break;
                }
            }

            if(!timedout){

            }else {
                Response map = getFullMap.getFullMap(model.getPlayer().getMap_id());
                otherplayertiles = map.readEntity(TileList.class);
               // int j = 32;
                for(int i = 31; i>=0; i--){
                    model.getTileList().getTiles().add(otherplayertiles.getTiles().get(i));
                }
                System.out.print(model.getTileList().getTiles().size() + "Mapsize");
                view.halfMapScreen(model.getTileList());
            }

        }else{
            System.out.println(response.readEntity(Error.class).getMessage());
        }
    }

    public void initReadyGameView(){
        String firstname = view.getFirstname().getText();
        String lastname = view.getLastname().getText();
        Integer age = parseInt(view.getAge().getText().trim()); //TODO: catch exception!!
        String nickname = view.getNickname().getText();
        Player player = new Player();
        model.getPlayer().setFirst_name(firstname);
        model.getPlayer().setLast_name(lastname);
        model.getPlayer().setAge(age);
        model.getPlayer().setNickname(nickname);
        POSTRegisterNewPlayer postRegisterNewPlayer = new POSTRegisterNewPlayer();
        Response response = postRegisterNewPlayer.registerPlayerXML(model.getPlayer());
        if(response.getStatus() == 200){
            //view.getGamewindow().setTitle();
            //view.readyGameScreen();
            initMapGeneration();
        }

    }



    //TODO: if response status != 200, what to do?
    public void initRegisterPlayerViewOne(){
        model.setPlayerno(1);
        GETStartNewGame getStartNewGame = new GETStartNewGame();
        Response response = getStartNewGame.createPlayerXML(model.getPlayerno());
        if(response.getStatus() == 200) {
            model.setPlayer(response.readEntity(Player.class));
            String player_id = model.getPlayer().getPlayer_id().toString();
            String game_id = model.getPlayer().getGame_id().toString();
            String map_id = model.getPlayer().getMap_id().toString();
            view.getGamewindow().setTitle("Player ID: " + player_id + " Game ID: " + game_id + " Map ID: " + map_id);
            view.playerDataScreen();
        }

    }
    //TODO: if response status != 200, what to do?

    public void initRegisterPlayerViewTwo(){
        model.setPlayerno(2);
        GETStartNewGame getStartNewGame = new GETStartNewGame();
        Response response = getStartNewGame.createPlayerXML(model.getPlayerno());
        if(response.getStatus() == 200) {
            model.setPlayer(response.readEntity(Player.class));
            String player_id = model.getPlayer().getPlayer_id().toString();
            String game_id = model.getPlayer().getGame_id().toString();
            String map_id = model.getPlayer().getMap_id().toString();
            view.getGamewindow().setTitle("Player ID: " + player_id + " Game ID: " + game_id + " Map ID: " + map_id);
            view.playerDataScreen();
        }
    }

    public void initPlayerNoView(){
        view.playerNoScreen();
    }

}
