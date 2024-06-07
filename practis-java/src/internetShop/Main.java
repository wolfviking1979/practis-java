package internetShop;

public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();

        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);

        Basket mashaBasket = new Basket( 5000);
        mashaBasket.add("Картошка", 30, 2, 2 );

        vasyaBasket.print("Корзина Васи:");
        petyaBasket.print("Корзина пети:");
        mashaBasket.print("Корзина Маши:");

    }
}
