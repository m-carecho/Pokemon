package pokemon;

public class Terrain {
    private MapType mapType;
    private boolean isPokemonSpawnable;
    private boolean isItemSpawnable;

    public Terrain() {
    }

    public Terrain(MapType mapType, boolean isPokemonSpawnable, boolean isItemSpawnable) {
        this.mapType = mapType;
        this.isPokemonSpawnable = isPokemonSpawnable;
        this.isItemSpawnable = isItemSpawnable;
    }

    public MapType getMapType() {
        return mapType;
    }

    public void setMapType(MapType mapType) {
        this.mapType = mapType;
    }

    public boolean isPokemonSpawnable() {
        return isPokemonSpawnable;
    }

    public void setPokemonSpawnable(boolean pokemonSpawnable) {
        isPokemonSpawnable = pokemonSpawnable;
    }

    public boolean isItemSpawnable() {
        return isItemSpawnable;
    }

    public void setItemSpawnable(boolean itemSpawnable) {
        isItemSpawnable = itemSpawnable;
    }
}
