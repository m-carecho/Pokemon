package pokemon;

public class Pokeball extends  Item{
    private PokeballType pokeballType;
    private double catchRate;

    public Pokeball() {
    }

    public Pokeball(PokeballType pokeballType, double catchRate) {
        this.pokeballType = pokeballType;
        this.catchRate = catchRate;
    }

    public Pokeball(String name, double value, String description, PokeballType pokeballType, double catchRate) {
        super(name, value, description);
        this.pokeballType = pokeballType;
        this.catchRate = catchRate;
    }

    public PokeballType getPokeballType() {
        return pokeballType;
    }

    public void setPokeballType(PokeballType pokeballType) {
        this.pokeballType = pokeballType;
    }

    public double getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(double catchRate) {
        this.catchRate = catchRate;
    }
}
