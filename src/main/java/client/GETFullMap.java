package client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class GETFullMap {

    final Client client = ClientBuilder.newClient(); // creating a new Client
    private static final String mapTarget = "http://localhost:7777/rest/map";


    public Response getFullMap(Integer map_id) {
        Response response = client.target(mapTarget).path(String.valueOf(map_id)).request(MediaType.APPLICATION_XML_TYPE).get();
        System.out.println(response.getStatus() + "Huhu");
        return response;
    }
}
