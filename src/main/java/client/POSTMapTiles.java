package client;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class POSTMapTiles{

    final Client client = ClientBuilder.newClient(); // creating a new Client
    private static final String mapwebTarget = "http://localhost:7777/rest/registernewmap";


    public Response registerMapXML(TileList tileList) {
        Response response = client.target(mapwebTarget).request(MediaType.APPLICATION_XML_TYPE).post(Entity.entity(tileList, MediaType.APPLICATION_XML_TYPE));
        System.out.println(response.getStatus() + "RegisterMap");
        return response;
    }
}
