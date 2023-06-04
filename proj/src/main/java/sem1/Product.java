package sem1;

public abstract class Product {
    private String kind;
    private double price;
    private Long id;
    private int temp;
    private double volume;

    public Product(String kind, double price, Long id) {
        this.kind = kind;
        this.price = price;
        this.id = id;
    }

    public Product(String kind, double volume, int temp){
        this.kind = kind;
        this.volume = volume;
        this.temp = temp;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
