package client;

public class Model {
    private Player player;

    Model(){};

    public Model(String firstname, String lastname, Integer age, String nickname){
        this.player.setFirst_name(firstname);
        this.player.setLast_name(lastname);
        this.player.setAge(age);
        this.player.setNickname(nickname);
    }

    public String getNickname(){
        return this.player.getNickname();
    }
}
