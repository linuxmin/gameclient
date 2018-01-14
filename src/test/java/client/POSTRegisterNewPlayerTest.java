package client;

import org.junit.Test;

import static org.junit.Assert.*;

public class POSTRegisterNewPlayerTest {
    @Test
    public void registerPlayerXML() throws Exception {
    POSTRegisterNewPlayer postRegisterNewPlayer = new POSTRegisterNewPlayer();
    Player player = new Player();
    assertEquals(417,postRegisterNewPlayer.registerPlayerXML(player).getStatus());

    }

}