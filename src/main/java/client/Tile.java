package client;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "tile")
@XmlAccessorType(XmlAccessType.FIELD)

public class Tile {
    @XmlElement(name = "tile_id")
    private Integer tile_id;

    @XmlElement(name = "type")
    private Integer type;

    @XmlElement(name = "x")
    private Integer x;

    @XmlElement(name = "y")
    private Integer y;

    @XmlElement(name = "castle")
    private Integer castle;

    @XmlElement(name = "treasure")
    private Integer treasure;

    @XmlElement(name="map_id")
    private Integer map_id;



    Tile() { }

    Tile(Tile tile){
        this.y = tile.getY();
        this.x = tile.getX();
        this.castle = tile.getCastle();
        this.type = tile.getType();
        this.treasure = tile.getTreasure();
    }
    public Integer getTile_id() {
        return tile_id;
    }

    public void setTile_id(Integer tile_id) {
        this.tile_id = tile_id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getX() {
        return x;
    }
    public Integer getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getCastle() {
        return castle;
    }

    public void setCastle(Integer castle) {
        this.castle = castle;
    }

    public Integer getTreasure() {
        return treasure;
    }

    public void setTreasure(Integer treasure) {
        this.treasure = treasure;
    }
    public Integer getMap_id() {
        return map_id;
    }

    public void setMap_id(Integer map_id) {
        this.map_id = map_id;
    }


}
