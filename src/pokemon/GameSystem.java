package pokemon;

import java.util.ArrayList;
import java.util.List;

public class GameSystem {

    public static List<Map> mapList = new ArrayList<>();

    public static void mapCreation(String name, MapType mapType, List<Terrain> terrainList) {
        Map map = new Map();
        map.setName(name);
        map.setMapType(mapType);
        map.setTerrains(terrainList);

        mapList.add(map);

    }

    public static Terrain terrainCreation(boolean playerPresent, boolean itemSpawn, boolean pokemonSpawn, MapType mapType,
                                          String description) {
        Terrain terrain = new Terrain();
        terrain.setPlayerPresent(playerPresent);
        terrain.setItemSpawnable(itemSpawn);
        terrain.setMapType(mapType);
        terrain.setPokemonSpawnable(pokemonSpawn);
        terrain.setDescription(description);
        return terrain;
    }



}
