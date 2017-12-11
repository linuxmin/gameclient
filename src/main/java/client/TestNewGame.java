package client;

import javax.ws.rs.core.Response;

public class TestNewGame {
    public static void main(final String[] args){
        GETStartNewGame getStartNewGame = new GETStartNewGame();
        Response response = getStartNewGame.createPlayerXML(2);
        if(response.getStatus() != 200){
            System.out.println(response.getStatus() + " Error");
        }else {
            Player player = new Player();
            player = response.readEntity(Player.class);
            System.out.println(player.getPlayer_id());
        }
    }
}
