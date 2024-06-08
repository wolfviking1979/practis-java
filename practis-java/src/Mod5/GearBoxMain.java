package Mod5;

public class GearBoxMain {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox();

        gearBox.shiftUp();
        gearBox.shiftUp();
        gearBox.shift_down();
        gearBox.switchNeutral();
        gearBox.switchRear();
    }
}
