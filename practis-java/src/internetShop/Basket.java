package internetShop;

public class Basket {

    private static String items = "";
    private static int totalPrice;


    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко", 55);
        add("Масло", 120);
        add("Масло", 110);
        int totalPrice = getTotalPrice();
        print("Содержимое корзины:");
        System.out.println("Общая стоимость товаров: " + totalPrice);
        clear();
        System.out.println();
        totalPrice = getTotalPrice();
        print("Содержимое корзины:");
        System.out.println("Общая стоимость товаров: " + totalPrice);
    }

    public static void add(String name, int price) {
        if (contains(name)){
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrice += price;
    }

    public static void clear() {
        items = "";
        totalPrice = 0;
    }

    public static boolean contains(String name){
        return items.contains(name);
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static void print(String title){
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println(items);
        }
    }
}
