package pokemon;

public class Person {
    private String name;
    private Gender gender;
    private String age;
    private boolean isBattleable;

    public Person(String name, Gender gender, String age, boolean isBattleable) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.isBattleable = isBattleable;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isBattleable() {
        return isBattleable;
    }

    public void setBattleable(boolean battleable) {
        isBattleable = battleable;
    }
}
