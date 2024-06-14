package JavaRush.Base.Cicle;
// Эта програсса выводит в консоль незаполненый увадрат.

public class UnFillRectangle {
    public static void main(String[] args) {

        int index_col = 0;
        while (index_col < 10){
            int index_row = 0;
            while (index_row < 20) {
                if (index_col == 0 || index_col == 9
                        || index_row == 0 || index_row == 19) {
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }

                index_row++;
            }
            index_col++;
            System.out.println(" ");
        }
    }
}
