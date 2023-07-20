package Inheritance;

public class Arithmetic {
    public String operator;
    public int sum;
    public int add(int num1, int num2){
         sum = num1 + num2;
        return sum;
    }

    public void displayOperator(){
        System.out.println("Arithmetic");
    }
}

