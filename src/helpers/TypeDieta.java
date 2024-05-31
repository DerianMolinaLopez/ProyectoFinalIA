package helpers;

public enum TypeDieta {
    //varia  valores entre 1 al 3
    NORMAL(1),
    SALUDABLE(2),
    POCO_SALUDABLE(3);

    public final int value;

    private TypeDieta(int value) {
        this.value = value;
    }
}
