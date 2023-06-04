package sem1;

public class Coffee extends Product{

    public Coffee(String kind, double volume, int temp) {
        super(kind, volume, temp);
    }

    @Override
    public String toString() {
        return String.format("Ваш кофе: %s, %s, %s",getKind(), getVolume(), getTemp());
    }
}
