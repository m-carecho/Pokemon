package pokemon;

public class Move {
    private String name;
    private Integer level;
    private Type type;
    private DamageCategory damageCategory;
    private int damage;
    private int accuracy;
    private int pp;

    public Move() {
    }

    public Move(String name, Integer level, Type type, DamageCategory damageCategory, int damage, int accuracy, int pp) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.damageCategory = damageCategory;
        this.damage = damage;
        this.accuracy = accuracy;
        this.pp = pp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public DamageCategory getDamageCategory() {
        return damageCategory;
    }

    public void setDamageCategory(DamageCategory damageCategory) {
        this.damageCategory = damageCategory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
}
