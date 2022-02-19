package pokemon;

import java.util.List;

public class Npc extends Person{
    private List<Pokemon> pokemonList;
    private double coins;
    private String catchPhrase;
    private boolean isEvil;

    public Npc(String name, Gender gender, String age, boolean isBattleable) {
        super(name, gender, age, isBattleable);
    }

    public Npc() {
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

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public boolean isEvil() {
        return isEvil;
    }

    public void setEvil(boolean evil) {
        isEvil = evil;
    }
}
