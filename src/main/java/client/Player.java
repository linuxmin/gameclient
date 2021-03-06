package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;

@XmlRootElement(name = "registernewplayer")
@XmlAccessorType(XmlAccessType.FIELD)

public class Player{
    @XmlElement(name="player_id")
    private Integer player_id;

    @XmlElement(name="first_name")
    private String first_name;

    @XmlElement(name="last_name")
    private String last_name;

    @XmlElement(name="age")
    private Integer age;

    @XmlElement(name="nickname")
    private String nickname;

    @XmlElement(name="game_id")
    private Integer game_id;


    @XmlElement(name="map_id")
    private Integer map_id;

    @XmlElement(name="time_start")
    private  String time_start = new Timestamp(System.currentTimeMillis()).toString();

    private Integer position;

    Player(){}  //default constructor for hibernate

   Player(Map map, Game game) {
        this.map_id = map.getMap_id();
        this.game_id = game.getGame_id();
    }

    Player(Integer player_id, String first_name, String last_name, Integer age, String nickname){
        //     init(player_id,first_name,last_name,age,nickname);
        this.player_id = player_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.nickname = nickname;
    }


    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getPlayer_id(){
        return this.player_id;
    }

    public String getFirst_name(){
        return this.first_name;
    }

    public String getLast_name(){
        return this.last_name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getNickname(){
        return this.nickname;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public Integer getMap_id() {
        return map_id;
    }

    public void setMap_id(Integer map_id) {
        this.map_id = map_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPlayerProperties(Player player) throws Exception{
        this.first_name = player.first_name;
        this.last_name = player.last_name;
        this.age = player.age;
        this.nickname = player.nickname;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
