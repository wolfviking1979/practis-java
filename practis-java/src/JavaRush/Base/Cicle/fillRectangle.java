package JavaRush.Base.Cicle;

public class fillRectangle {
    public static void main(String[] args) {
        int index_col = 0;
        while (index_col < 5) {
            int index_row = 0;
            while (index_row < 10) {
                System.out.print("Q");
                index_row++;
            }
            System.out.println(" ");
            index_col++;
        }

    }
}
