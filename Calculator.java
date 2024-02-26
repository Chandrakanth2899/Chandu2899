abstract class Calculator  {
    abstract int add(int num1, int num2);
    abstract int sub(int num1, int num2);
}

class BasicCalculator extends Calculator {
          @Override
          int add(int num1, int num2) {

             return num1 + num2;
     }
           @Override 
           int sub(int num1, int num2) {
    
               return num1 - num2;
     }
}
 
public class Main {
      public static void main(String[] args) {
           BasicCalculator myCalculator = new BasicCalculator();

      System.out.println("Addition: " + myCalculator.add(10,7));
      System.out.println("Subtraction: " + myCalculator.sub(10,7));

     }
}
