package Mod4.Arithmetic;

public class Arithmetic {
    private int numberA;
    private int numberB;

    public Arithmetic(int numberA, int getNumberB) {
        this.numberA = numberA;
        this.numberB = getNumberB;
    }

    public void numberSum (){
        System.out.println("Сумма чисел: " + numberA + " и " + numberB +
                " равна " + (numberA + numberB));
    }

    public void multiNumbers(){
        System.out.println("Произведение чисел: " + numberA + " и " + numberB + " равна " +
                (numberA * numberB));
    }

    public void maximalNumber() {
        if (numberA > numberB) {
            System.out.println("Максимальное число: " + numberA);
        } else {
            System.out.println("Максимальное число: " + numberB);
        }
    }

    public void minimalNumber() {
        if (numberA < numberB) {
            System.out.println("Минимальное число: " + numberA);
        } else {
            System.out.println("Минимальное число: " + numberB);
        }
    }


}
