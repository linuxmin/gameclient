package client;

import org.junit.Test;

import static org.junit.Assert.*;

public class MapGeneratorTest {
    @Test
    public void generateMap() throws Exception {
        MapGenerator mapGenerator = new MapGenerator();
        assertEquals(mapGenerator.generateMap(1).getTiles().size(), 32);
    }
}