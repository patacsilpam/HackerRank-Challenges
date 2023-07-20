package Interface.Flyable;

import Interface.Flyable.Flyable;

public class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}
