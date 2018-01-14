package client;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void getPlayerno() throws Exception {
        Model model = new Model();
        model.setPlayerno(1);
        Integer expected = 1;
        assertEquals(expected,model.getPlayerno());
    }

    @Test
    public void setTileList() throws Exception {
        Model model = new Model();
        TileList tileList = new TileList();
        Player player = new Player();
        player.setPlayer_id(1);
        model.setPlayer(player);
        model.setTileList(tileList);
        Integer expected = 1;
        assertEquals(expected,model.getTileList().getPlayer_id());
    }
}