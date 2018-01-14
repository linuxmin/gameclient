package client;

import org.junit.Test;

import static org.junit.Assert.*;

public class GETFullMapTest {
    @Test
    public void getFullMap() throws Exception {
        GETFullMap getFullMap = new GETFullMap();
        assertEquals(204,getFullMap.getFullMap(111).getStatus());
    }

}