package pokemon;

public class Potion extends  Item{
    private PotionType potionType;
    private int healing;

    public Potion() {
    }

    public Potion(String name, double value, String description) {
        super(name, value, description);
    }

    public PotionType getPotionType() {
        return potionType;
    }

    public void setPotionType(PotionType potionType) {
        this.potionType = potionType;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }
}
