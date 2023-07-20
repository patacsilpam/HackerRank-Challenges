package Interface.Arithmetic;

import Interface.Arithmetic.MyCalculator;

public class Main {
    public static void main(String[] args) {
        int number = 6;
        MyCalculator myCalculator = new MyCalculator();
        int sum = myCalculator.divisor_sum(number);
        System.out.println(sum + " " + number);

    }
}
