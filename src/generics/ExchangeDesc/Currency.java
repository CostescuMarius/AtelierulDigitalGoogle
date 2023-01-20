package generics.ExchangeDesc;

public abstract class Currency {
    private String name;
    private float value;

    public Currency(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
