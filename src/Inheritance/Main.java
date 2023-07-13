package Inheritance;
public class Main {
    public static void main(String[] args) {
        //Hackerrank Solved Challenges
        Adder adder = new Adder();
        adder.operator = "Addition";
        adder.displayOperator();
        System.out.println(adder.add(12,15));
    }
}