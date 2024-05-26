package helpers;

public enum ObesityValue {
    OBESITY_TRUE(1),
    OBESITY_FALSE(0);

    public final int value;

    private ObesityValue(int value) {
        this.value = value;
    }
}
