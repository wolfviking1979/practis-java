package Mod5;

public class GearBox {
    private final int MAX_GEAR = 6;
    private final int MIN_GEAR = 1;

    private int gear = 0;

    public void shiftUp() {
        gear = gear < MAX_GEAR ? gear++ : gear;
    }

    public void shift_down() {
        gear = gear > MIN_GEAR ? gear-- : gear;
    }

    public void switchRear() {
        gear = (gear > 1) ? gear : -1;
    }

    public void switchNeutral() {
        gear = 0;
    }

    public int getGear() {
        return gear;
    }
}
