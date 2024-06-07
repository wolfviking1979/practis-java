package internetShop;

public class Basket {

    private  String items = "";
    private int totalPrice;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        items = "Список товаров:\n";
        this.limit = 100000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count){
       add(name, price, count, 0);
    }

    public void add(String name, int price, int count, double weight) {
        if (contains(name)){
            return;
        }

        if(totalPrice + count * price >= limit){
            return;
        }


        totalPrice += count * price;
        totalWeight += count * weight;
        items = items  + name + " - " + count + " шт. - " + totalWeight + " кг. - " + totalPrice + "\n";
    }


    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public boolean contains(String name){
        return items.contains(name);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void print(String title){
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println(items);
        }
    }
}
