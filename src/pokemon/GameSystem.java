package pokemon;

import java.util.ArrayList;
import java.util.List;

public class System {
    private static List<Map> mapList = new ArrayList<>();

    public void mapCreation(String name, MapType mapType){
        Map map = new Map();
        map.setName(name);
        map.setMapType(mapType);
        while (map.getTerrains().size() < 9) {
            map.getTerrains().add(terrainCreation(false, true, true, mapType));
        }
        mapList.add(map);
    }

    public Terrain terrainCreation(boolean playerPresent, boolean itemSpawn, boolean pokemonSpawn, MapType mapType){
            Terrain terrain = new Terrain();
            terrain.setPlayerPresent(playerPresent);
            terrain.setItemSpawnable(itemSpawn);
            terrain.setMapType(mapType);
            terrain.setPokemonSpawnable(pokemonSpawn);
            return terrain;
    }

    public void mapMovement(Map map){

    }

}
