package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;


@XmlRootElement(name = "registernewmap")
@XmlAccessorType(XmlAccessType.FIELD)

public class Map{
    @XmlElement(name="map_id")
    private Integer map_id;

    @XmlElement(name="game_id")
    private Integer game_id;

    @XmlElement(name="player_id")
    private Integer player_id;

    @XmlElement(name="time_start_generation")
    private Timestamp time_start_generation = new Timestamp(System.currentTimeMillis());

    @XmlElement(name="time_end_generation")
    private Timestamp time_end_generation;

    //  @OneToMany(mappedBy = "mappingmap")
    //  private List<Tile> tiles;



    Map(){}  //default constructor for hibernate


    Map(Game game){
        // this.player_id = player.getPlayer_id();
        this.game_id = game.getGame_id();
    }

    Map(Player player){
        this.player_id = player.getPlayer_id();
        //this.map_id =  map.getMap_id();
    }

    public Map(Integer map_id, Integer game_id, Integer player_id) {
        this.map_id = map_id;
        this.game_id = game_id;
        this.player_id = player_id;
    }



    public Integer getMap_id() {
        return map_id;
    }

    public void setMap_id(Integer map_id) {
        this.map_id = map_id;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }


    public Timestamp getTime_start_generation() {
        return time_start_generation;
    }
    public void setTime_start_generation(Timestamp time_start_generation) {
        this.time_start_generation = time_start_generation;
    }

    public Timestamp getTime_end_generation() {
        return time_end_generation;
    }

    public void setTime_end_generation(Timestamp time_end_generation) {
        this.time_end_generation = time_end_generation;
    }

    public boolean checkSeconds(){ //again a function to check if mapgeneration lasted shorter than 3 sec
        Long diff;
        if(this.time_start_generation != null && this.time_end_generation != null){
            diff = (this.time_start_generation.getTime() - this.time_end_generation.getTime())/1000;
            if(diff > 3){
                return false;
            }
            return true;
        }
        return false;
    }
}
