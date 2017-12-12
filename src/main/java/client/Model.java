package client;

public class Model {
    Integer playerno;
    private Player player;

    Model(){};
    
    Model(Integer playerno){};

    public Model(String firstname, String lastname, Integer age, String nickname){
        this.player.setFirst_name(firstname);
        this.player.setLast_name(lastname);
        this.player.setAge(age);
        this.player.setNickname(nickname);
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
}
