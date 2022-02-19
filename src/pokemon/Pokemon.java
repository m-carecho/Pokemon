package pokemon;

import java.util.List;

public class Pokemon {
    private String name;
    private String species;
    private List<Move> moveList;
    private List<Ability> abilityList;
    private Type one;
    private Type two;
    private double health;
    private double xp;

    public Pokemon() {
    }

    public Pokemon(String name, String species, List<Move> moveList, List<Ability> abilityList, Type one, Type two, double health, double xp) {
        this.name = name;
        this.species = species;
        this.moveList = moveList;
        this.abilityList = abilityList;
        this.one = one;
        this.two = two;
        this.health = health;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public void setMoveList(List<Move> moveList) {
        this.moveList = moveList;
    }

    public List<Ability> getAbilityList() {
        return abilityList;
    }

    public void setAbilityList(List<Ability> abilityList) {
        this.abilityList = abilityList;
    }

    public Type getOne() {
        return one;
    }

    public void setOne(Type one) {
        this.one = one;
    }

    public Type getTwo() {
        return two;
    }

    public void setTwo(Type two) {
        this.two = two;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
}
