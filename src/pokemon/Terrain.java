package pokemon;

public class Terrain {
    private MapType mapType;
    private boolean isPokemonSpawnable;
    private boolean isItemSpawnable;
    private boolean isPlayerPresent;
    private String description;
    private String newDescription;

    public Terrain() {
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

    public boolean isPlayerPresent() {
        return isPlayerPresent;
    }

    public void setPlayerPresent(boolean playerPresent) {
        isPlayerPresent = playerPresent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNewDescription() {
        return newDescription;
    }

    public void setNewDescription(String newDescription) {
        this.newDescription = newDescription;
    }
}



