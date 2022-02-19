package pokemon;

import java.util.Arrays;
import java.util.List;

public class Script {

    public static void fillMapList(){

        Terrain terrain1 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "Short Grass");
        Terrain terrain2 = GameSystem.terrainCreation(false, false, true, MapType.FOREST,
                "Short Grass");
        Terrain terrain3 = GameSystem.terrainCreation(false, false, true, MapType.CAVE,
                "Cave Entrance");
        Terrain terrain4 = GameSystem.terrainCreation(false, true, false, MapType.FOREST,
                "City Entrance");
        Terrain terrain5 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "Path");
        Terrain terrain6 = GameSystem.terrainCreation(false, false, false, MapType.FOREST,
                "Path");
        Terrain terrain7 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Short Grass");
        Terrain terrain8 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Tall Grass");
        Terrain terrain9 = GameSystem.terrainCreation(false, true, true, MapType.FOREST,
                "Tall Grass");

        GameSystem.mapCreation("Route 1", MapType.FOREST, Arrays.asList(terrain1, terrain2, terrain3, terrain4,
                terrain5, terrain6, terrain7, terrain8, terrain9));
    }


}
