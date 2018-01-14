package client;

import org.junit.Test;

import static org.junit.Assert.*;

public class GETStartNewGameTest {
    @Test
    public void createPlayerXML() throws Exception {
        GETStartNewGame getStartNewGame = new GETStartNewGame();
        assertEquals(406,getStartNewGame.createPlayerXML(3).getStatus());
    }

}