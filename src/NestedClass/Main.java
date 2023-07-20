package NestedClass;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car("Mazda","4WD");
        Car.Engine engine = car.new Engine();
        engine.setEngineType();
        System.out.println(engine.getEngineType());

        Car car2 = new Car("Mazda","8WD");
        Car.Engine engine1 = car2.new Engine();
        engine1.setEngineType();
        System.out.println(engine1.getEngineType());
    }
}
