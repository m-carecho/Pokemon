package pokemon;

import java.util.Arrays;
import java.util.List;

public class Script {

    public static void fillMapList(){

        Terrain map1Terrain1 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "Short Grass", "0");
        Terrain map1terrain2 = GameSystem.terrainCreation(false, false, true, MapType.FOREST,
                "Short Grass", "1");
        Terrain map1terrain3 = GameSystem.terrainCreation(false, false, true, MapType.CAVE,
                "Cave Entrance", "2");
        Terrain map1terrain4 = GameSystem.terrainCreation(false, true, false, MapType.FOREST,
                "City Entrance", "3");
        Terrain map1terrain5 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "Path", "4");
        Terrain map1terrain6 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "\tPath", "5");
        Terrain map1terrain7 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Short Grass", "6");
        Terrain map1terrain8 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Tall Grass", "7");
        Terrain map1terrain9 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Tall Grass", "8");

        GameSystem.mapCreation("Route 1", MapType.FOREST, Arrays.asList(map1Terrain1, map1terrain2, map1terrain3, map1terrain4,
                map1terrain5, map1terrain6, map1terrain7, map1terrain8, map1terrain9));

        Terrain map2terrain1 = GameSystem.terrainCreation(false, false, true, MapType.CAVE,
                "Rocky path", "0");
        Terrain map2terrain2 = GameSystem.terrainCreation(false, false, true, MapType.CAVE,
                "Rocky path", "1");
        Terrain map2terrain3 = GameSystem.terrainCreation(false, false, true, MapType.SEA,
                "\tlake", "2");
        Terrain map2terrain4 = GameSystem.terrainCreation(false, true, true, MapType.CAVE,
                "Rocky path", "3");
        Terrain map2terrain5 = GameSystem.terrainCreation(false, false, true, MapType.CAVE,
                "Large Rock", "4");
        Terrain map2terrain6 = GameSystem.terrainCreation(false, false, true, MapType.SEA,
                "\t lake", "5");
        Terrain map2terrain7 = GameSystem.terrainCreation(false, true, true, MapType.CAVE,
                "Rocky path", "6");
        Terrain map2terrain8 = GameSystem.terrainCreation(false, true, true, MapType.CAVE,
                "Too dark to see", "7");
        Terrain map2terrain9 = GameSystem.terrainCreation(false, true, true, MapType.CAVE,
                "Too dark do see", "8");

        GameSystem.mapCreation("cave 1", MapType.CAVE, Arrays.asList(map2terrain1, map2terrain2, map2terrain3, map2terrain4,
                map2terrain5, map2terrain6, map2terrain7, map2terrain8, map2terrain9));

    }


}
