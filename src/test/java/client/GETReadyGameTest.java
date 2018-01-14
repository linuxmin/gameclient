package client;

import org.junit.Test;

import static org.junit.Assert.*;

public class GETReadyGameTest {
    @Test
    public void getGameStatus() throws Exception {
        GETReadyGame getReadyGame = new GETReadyGame();
        assertEquals(417,getReadyGame.getGameStatus(1).getStatus());
    }
}