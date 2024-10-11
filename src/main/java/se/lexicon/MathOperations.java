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


    public static int multiply(int num1 , int num2){
        return num1 * num2;
    }
    public static int divide(int num1 , int num2){
        return num1 / num2;
    }
}
