package client;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class POSTRegisterNewPlayer {

    final Client client = ClientBuilder.newClient(); // creating a new Client
    private static final String playerwebTarget = "http://localhost:7777/rest/registernewplayer";


    public Response registerPlayerXML(Player player) {
        Response response = client.target(playerwebTarget).request(MediaType.APPLICATION_XML_TYPE).post(Entity.entity(player, MediaType.APPLICATION_XML_TYPE));
        System.out.println(response.getStatus());
        return response;
    }
}
