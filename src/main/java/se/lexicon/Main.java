package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) {
        System.out.println(MathOperations.add(5,2,7));
        System.out.println(MathOperations.subtract(8,6));
        System.out.println(MathOperations.multiply(2,3,2));
        try {
            System.out.println(MathOperations.divide(5, 0));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}