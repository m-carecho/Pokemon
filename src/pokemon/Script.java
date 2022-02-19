package pokemon;

import java.util.Arrays;
import java.util.List;

public class Script {

    public static void fillMapList(){

        Terrain terrain1 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "Short Grass", "0");
        Terrain terrain2 = GameSystem.terrainCreation(false, false, true, MapType.FOREST,
                "Short Grass", "1");
        Terrain terrain3 = GameSystem.terrainCreation(false, false, true, MapType.CAVE,
                "Cave Entrance", "2");
        Terrain terrain4 = GameSystem.terrainCreation(false, true, false, MapType.FOREST,
                "City Entrance", "3");
        Terrain terrain5 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "Path", "4");
        Terrain terrain6 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "\tPath", "5");
        Terrain terrain7 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Short Grass", "6");
        Terrain terrain8 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Tall Grass", "7");
        Terrain terrain9 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Tall Grass", "8");

        GameSystem.mapCreation("Route 1", MapType.FOREST, Arrays.asList(terrain1, terrain2, terrain3, terrain4,
                terrain5, terrain6, terrain7, terrain8, terrain9));
    }


}
