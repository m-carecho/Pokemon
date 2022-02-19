package pokemon;

import java.util.List;

public class Map {
    private List<Terrain> terrains;
    private MapType mapType;

    public Map() {
    }


    public Map(List<Terrain> terrains, MapType mapType) {
        this.terrains = terrains;
        this.mapType = mapType;
    }

    public List<Terrain> getTerrains() {
        return terrains;
    }

    public void setTerrains(List<Terrain> terrains) {
        this.terrains = terrains;
    }

    public MapType getMapType() {
        return mapType;
    }

    public void setMapType(MapType mapType) {
        this.mapType = mapType;
    }
}
