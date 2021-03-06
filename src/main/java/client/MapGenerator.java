package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MapGenerator {
    public TileList generateMap(Integer map_id) {
        TileList tileList = new TileList();
        List<Tile> tiles = new ArrayList<>();
        Integer water = 5;
        Integer borderwater = 3;
        Integer mountain = 5;
        Integer castle = 1;
        Random random = new Random();
        Integer randomtype = 0;
        Integer randomcastle = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 7; j++) {
                Tile tile = new Tile();
                tile.setMap_id(map_id);
                tile.setX(j);
                tile.setY(i);
                randomtype = Math.abs(random.nextInt()) % 3 + 1;
                randomcastle = Math.abs(random.nextInt()) % 20 + 1;
                tile.setCastle(0);
                tile.setType(4);
                do {
                    switch (randomtype) {
                        case 1:
                            tile.setType(1);
                            if (randomcastle > 5 && castle > 0) {
                                tile.setCastle(1);
                                tile.setPosition(1);
                                tile.setType(4);
                                castle = 0;
                            }
                            break;
                        case 2:
                            if (mountain > 0) {
                                tile.setType(2);
                                mountain = mountain - 1;
                            } else
                                tile.setType(1);
                            break;
                        case 3:
                            if (water > 0) {
                                if (i == 0) {
                                    tile.setType(3);
                                    water = water - 1;
                                } else if (i == 3 && borderwater > 0) {
                                    tile.setType(3);
                                    water = water - 1;
                                    borderwater = borderwater - 1;
                                } else {
                                    tile.setType(1);
                                }
                            } else
                                tile.setType(1);
                            break;
                    }
                    tiles.add(tile);
                } while (water != 0 && mountain != 0 && castle != 0 && borderwater < 0);
            }
            tileList.setTiles(tiles);
        }
        return tileList;
    }
}

