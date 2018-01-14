package client;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class GameView extends Applet {

    static int[][] tilemap;
    static int rows, columns;
    private TileList tileList = new TileList();


    public TileList getTileList() {
        return this.tileList;
    }

    public void setTileList(TileList tileList) {
        this.tileList = tileList;
        this.repaint();
    }

    @Override
    public void init() {
        setSize(800, 800);
        setBackground(Color.BLACK);
        createTilemap();
        this.setVisible(true);

    }

    public GameView (TileList tileList){
        this.tileList = tileList;
        this.init();
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                int mod_i = 100*i;
                int mod_j = 100*j;

                switch (tilemap[i][j]) {
                    case 1:
                        g.setColor(Color.GREEN);
                        g.fillRect(mod_i, mod_j, 100, 100);
                        break;
                    case 2:
                        g.setColor(Color.GRAY);
                        g.fillRect(mod_i, mod_j, 100, 100);
                        break;
                    case 3:
                        g.setColor(Color.BLUE);
                        g.fillRect(mod_i, mod_j, 100, 100);
                        break;
                    case 4:
                        g.setColor(Color.WHITE);
                        g.fillRect(mod_i, mod_j, 100, 100);
                        break;

                }

            }

        }

    }

    public void createTilemap() {

        tilemap = new int[9][20];
        rows = 8;
        columns = 8;


        Random r = new Random();

        for(int i = 0; i<64; i++){
            System.out.println(tileList.getTiles().get(i).getX() + " " + tileList.getTiles().get(i).getY() + " Typ: " +tileList.getTiles().get(i).getType() );
            tilemap[tileList.getTiles().get(i).getX()][tileList.getTiles().get(i).getY()] = tileList.getTiles().get(i).getType();
        }
        /*
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tilemap[i][j] = r.nextInt(5);
            }
        }
        */
    }

}
