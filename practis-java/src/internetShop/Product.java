package internetShop;

public class Product {
    private final String name;
    private final   int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Product setName(String name) {
        return new Product(name, price);
    }

    public Product setPrice(int price) {
        return new Product(name, price);
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
