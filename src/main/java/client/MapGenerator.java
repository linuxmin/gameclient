package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapGenerator {
    public TileList generateMap(Integer map_id){
        TileList tileList = new TileList();
        List<Tile> tiles = new ArrayList<>();
        Integer water = 5;
        Integer borderwater = 3;
        Integer mountain = 5;
        //Integer grass = 0;
        Integer castle = 1;
        Random random = new Random();
        Integer randomtype = 0;
        Integer randomcastle = 0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=8;j++){
                Tile tile = new Tile();
                tile.setMap_id(map_id);
                tile.setX(j);
                tile.setY(i);
                randomtype = Math.abs(random.nextInt()) % 3 + 1;
                randomcastle = Math.abs(random.nextInt()) % 20 + 1;
                switch(randomtype){
                    case 1:
                        tile.setType(1);
                        if(randomcastle > 5 && castle > 0){
                            tile.setCastle(1);
                            castle = 0;
                        }
                        break;
                    case 2:
                        if(mountain > 0) {
                            tile.setType(2);
                            mountain = mountain - 1;
                        }else
                            tile.setType(1);
                        break;
                    case 3:
                        if(water > 0) {
                            if (i == 1) {
                                tile.setType(3);
                                water = water - 1;
                            }else if(i == 4 && borderwater > 0){
                                tile.setType(3);
                                water =water - 1;
                                borderwater = borderwater -1;
                            }else{
                                tile.setType(1);
                            }
                        }else
                            tile.setType(1);
                        break;
                }
                tiles.add(tile);
            }
        }
        tileList.setTiles(tiles);
        return tileList;
    }


}
