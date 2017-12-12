package client;

import java.util.List;

public class TestView {
    public static void main(final String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.initView();
        controller.initController();
    /*  Model model = new Model();
      Player player = new Player();
      player.setMap_id(1);
      player.setPlayer_id(2);
      player.setGame_id(3);
      model.setPlayer(player);
      model.generateMap();
      TileList tileList = model.getTileList();
      for(Tile tile : tileList.getTiles()){
          System.out.println(tile.getX() + " " + tile.getY() + " Type " + tile.getType() + " Castle " + tile.getCastle());
      } */
    }
}
