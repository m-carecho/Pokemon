package pokemon;

import java.util.List;

public class Player extends Person{
    private List<Pokemon> pokemonList;
    private double coins;

    public Player() {
    }

    public Player(String name, Gender gender, String age, boolean isBattleable) {
        super(name, gender, age, isBattleable);
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public double getCoins() {
        return coins;
    }

    public void setCoins(double coins) {
        this.coins = coins;
    }
}
