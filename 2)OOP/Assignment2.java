class Calculator {

    public static int powerInt(int num1, int num2) {
      return (int) Math.pow(num1, num2);
    }
  
    public static double powerDouble(double num1, int num2) {
      return Math.pow(num1, num2);
    }
}

public class Assignment2 {
    public static void main(String[] args) {

      int resultInt = Calculator.powerInt(2, 3);
      System.out.println("2 to the power 3: " + resultInt);
  
      double resultDouble = Calculator.powerDouble(2.5, 2);
      System.out.println("2.5 to the power 2: " + resultDouble);
    }
  }