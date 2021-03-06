package client;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Model {
    private static final Logger LOGGER = LogManager.getLogger(Model.class);

    Integer playerno;
    private Player player;
    private TileList tileList;

    Model(){};
    
    Model(Integer playerno){};

    public Model(String firstname, String lastname, Integer age, String nickname){
        this.player.setFirst_name(firstname);
        this.player.setLast_name(lastname);
        this.player.setAge(age);
        this.player.setNickname(nickname);
    }

    public TileList getTileList() {
        return tileList;
    }

    public void setTileList(TileList tileList) {
        this.tileList = tileList;
        this.tileList.setPlayer_id(player.getPlayer_id());
    }

    public Integer getPlayerno() {
        return playerno;
    }

    public void setPlayerno(Integer playerno) {
        this.playerno = playerno;
    }

    public Player getPlayer() {
        return player;
    }



    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getNickname(){
        return this.player.getNickname();
    }

    public void generateMap(){
        MapGenerator mapGenerator = new MapGenerator();
        setTileList(mapGenerator.generateMap(this.player.getMap_id()));
        for(int i = 0;i<31;i++){
            if(tileList.getTiles().get(i).getCastle() == 1){
                this.player.setPosition(i);
                break;
            }
        }
    }

}
