package client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class GETReadyGame {

    final Client client = ClientBuilder.newClient(); // creating a new Client
    private static final String playerwebTarget = "http://localhost:7777/rest/readygame";


    public Response getGameStatus(Integer player_id) {
        Response response = client.target(playerwebTarget).path(String.valueOf(player_id)).request(MediaType.APPLICATION_XML_TYPE).get();
        System.out.println(response.getStatus());
        return response;
    }
}
