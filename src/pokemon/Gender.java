package pokemon;

public enum Gender {
    MALE("\033[1;34m"), FEMALE("\033[1;35m"), OTHERS("\033[1;33m");

    String cor;

    Gender(String cor) {
    this.cor = cor;
    }

}
