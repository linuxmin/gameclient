package client;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameViewTest {


    @Test
    public void getTileList() throws Exception {
    }

    @Test
    public void setTileList() throws Exception {
    }

    @Test
    public void init() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        Player player = new Player();
        player.setPlayer_id(1);
        model.setPlayer(player);
        model.generateMap();
        Model othermodel = new Model();
        Player otherplayer = new Player();
        otherplayer.setPlayer_id(2);
        othermodel.setPlayer(otherplayer);
        othermodel.generateMap();
        for(int i = 31; i>=0; i--){
            model.getTileList().getTiles().add(othermodel.getTileList().getTiles().get(i));
        }
        GameView gameView = new GameView(model.getTileList());
        gameView.setTileList(model.getTileList());
        assertEquals(64,gameView.getTileList().getTiles().size());
        assertEquals(800, gameView.getHeight());
    }


}