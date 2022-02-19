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
                                          String description, String index) {
        Terrain terrain = new Terrain();
        terrain.setPlayerPresent(playerPresent);
        terrain.setItemSpawnable(itemSpawn);
        terrain.setMapType(mapType);
        terrain.setPokemonSpawnable(pokemonSpawn);
        terrain.setDescription(description);
        terrain.setIndex(index);
        return terrain;
    }

    public static void mapMovement(Map map, int movement) {
        for (Terrain terrain : map.getTerrains())
            terrain.setPlayerPresent(false);
        map.getTerrains().get(movement).setPlayerPresent(true);
        for (Terrain terrain : map.getTerrains()) {
            if (terrain.isPlayerPresent())
                terrain.setUpdatedIndex(Gender.MALE.cor+"X"+"\033[0;38m");
            else terrain.setUpdatedIndex(terrain.getIndex());
        }
        System.out.println(map.getTerrains().get(0).getDescription() + " ["+map.getTerrains().get(0)
                .getUpdatedIndex()+"]\t\t\t" + map.getTerrains().get(1).getDescription() + " ["+map.getTerrains()
                .get(1).getUpdatedIndex()+"]\t\t\t" + map.getTerrains().get(2).getDescription() + " ["+map.getTerrains()
                .get(2).getUpdatedIndex()+"]");
        System.out.println();
        System.out.println(map.getTerrains().get(3).getDescription() + " ["+map.getTerrains().get(3)
                .getUpdatedIndex()+"]\t\t" + map.getTerrains().get(4).getDescription() + " ["+map.getTerrains().get(4)
                .getUpdatedIndex()+"]\t\t\t" + map.getTerrains().get(5).getDescription() + " ["+map.getTerrains()
                .get(5).getUpdatedIndex()+"]");
        System.out.println();
        System.out.println(map.getTerrains().get(6).getDescription() + " ["+map.getTerrains().get(6)
                .getUpdatedIndex()+"]\t\t\t" + map.getTerrains().get(7).getDescription() + " ["+map.getTerrains().get(7)
                .getUpdatedIndex()+"]\t\t\t" + map.getTerrains().get(8).getDescription() + " ["+map.getTerrains().get(8)
                .getUpdatedIndex()+"]");
        System.out.println();
    }



}
