package Interface.Flyable;

public class Main {
    public static void main(String[] args) {
        /*
        * Write a Java program to create an interface Flyable
        *  with a method called fly_obj(). Create three classes
        *  Spacecraft, Airplane, and Helicopter that implement
        * the Flyable interface. Implement the fly_obj() method
        * for each of the three classes.
        * */

        //Lesson: An interface can be displayed through loopoing pala if we implement it to many classes
        //Example below
        Flyable[] flyingObject = {new Spacecraft(),new Helicopter(), new Airplane()};
        for (Flyable obj : flyingObject){
            obj.fly_obj();
        }
    }
}
