package client;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class POSTActionMove{

    final Client client = ClientBuilder.newClient(); // creating a new Client
    private static final String actionwebTarget = "http://localhost:7777/rest/action";


    public Response actionMoveXML(ActionMove actionMove) {
        Response response = client.target(actionwebTarget).request(MediaType.APPLICATION_XML_TYPE).post(Entity.entity(actionMove, MediaType.APPLICATION_XML_TYPE));
        System.out.println(response.getStatus() + "ActionMove");
        return response;
    }
}
