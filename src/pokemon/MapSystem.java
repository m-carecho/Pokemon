package pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapSystem {

    public static List<Map> mapList = new ArrayList<>();

    private static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static void mapCreation(String name, MapType mapType, List<Terrain> terrainList) {
        Map map = new Map();
        map.setName(name);
        map.setMapType(mapType);
        map.setTerrains(terrainList);

        mapList.add(map);

    }

    public static Terrain terrainCreation(boolean playerPresent, boolean itemSpawn, boolean pokemonSpawn, MapType mapType,
                                          String description, String index, boolean isAnAcess, boolean firstTerrain) {
        Terrain terrain = new Terrain();
        terrain.setPlayerPresent(playerPresent);
        terrain.setItemSpawnable(itemSpawn);
        terrain.setMapType(mapType);
        terrain.setPokemonSpawnable(pokemonSpawn);
        terrain.setDescription(description);
        terrain.setIndex(index);
        terrain.setAnAccess(isAnAcess);
        terrain.setFirstTerrain(firstTerrain);
        return terrain;
    }

    public static int mapUpdate(Map map, int movement) {
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

        if (map.getTerrains().get(movement).isAnAccess()){
            String changeMap = scanner("Do you wanna enter in " + map.getTerrains().get(movement).getDescription() + "?")
                    .next();
            if (changeMap.equalsIgnoreCase("yes")){
                if (map.getTerrains().get(movement).isFirstTerrain()){
                    return -1;
                }
                return 1;
            }
        }
        return 0;
    }

    public static void playerMovement(Player player, List<Map> mapList){
        boolean movementLoop = true;
        for (Terrain terrain: mapList.get(player.getCurrentMapIndex()).getTerrains()){
            if(terrain.isFirstTerrain()){
                mapUpdate(mapList.get(player.getCurrentMapIndex()), Integer.parseInt(terrain.getIndex()));
            }
        }
        while (movementLoop){
            int destination = scanner("Where do you wanna go? Answer with the location number").nextInt();
            int mapChange = mapUpdate(mapList.get(player.getCurrentMapIndex()), destination);
            player.setCurrentMapIndex(player.getCurrentMapIndex() + mapChange);
            if (mapChange != 0){
                for (Terrain terrain: mapList.get(player.getCurrentMapIndex()).getTerrains()){
                    if(terrain.isFirstTerrain()){
                        mapUpdate(mapList.get(player.getCurrentMapIndex()), Integer.parseInt(terrain.getIndex()));
                    }
                }
            }

        }
    }

}
