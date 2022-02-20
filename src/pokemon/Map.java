package pokemon;

import java.util.List;

public class Map {
    private String name;
    private List<Terrain> terrains;
    private MapType mapType;

    public Map() {
    }


    public Map(List<Terrain> terrains, MapType mapType) {
        this.terrains = terrains;
        this.mapType = mapType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
