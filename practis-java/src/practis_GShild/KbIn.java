package practis_GShild;

public class KbIn {
    public static void main(String[] args)
            throws java.io.IOException  {

        char ch;
        System.out.println("Нажмите нужную клавишу, " +
                "а затем клавишу Enter: ");

        ch = (char) System.in.read();       // Получить символ.

        System.out.println("Вы нажали клавишу: " + ch);
    }
}
