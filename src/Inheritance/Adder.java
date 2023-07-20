package Inheritance;

public class Adder extends Arithmetic {
    public void displayOperator(){
        super.displayOperator();
        System.out.println(operator);
    }

    public int add(int num1, int num2){
         sum = num1 + num2;
        return sum;
    }

}
