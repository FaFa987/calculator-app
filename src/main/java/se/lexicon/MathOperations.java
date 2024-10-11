package se.lexicon;

public class MathOperations {

    public static int add(int... numbers){    //1,5,4
        int sum = 0;
        for(int number : numbers){
            sum += number;      //0+1 1+5 6+4
        }
    return sum;
        }


    public static int subtract(int num1 , int num2){

        return num1-num2;
    }


    public static int multiply(int... numbers){
        int multi = 1;
        for(int number : numbers){
            multi *= number; // 1*2 2*3 6*2
        }
        return multi;
    }
    public static int divide(int num1 , int num2){
        if(num2==0){
            throw new ArithmeticException("Divide by zero");
        }
        return num1 / num2;
    }
}
