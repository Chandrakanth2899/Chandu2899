public class Min {
  public static void main(String[] args) {
   
   int num1 = 11;
   int num2 = 23;
   int num3 = 28;
   
   if (num1 <= num2 && num1 <= num3)
      System.out.println("The minimum number is: " + num1);
   else if (num2 <= num1 && num2 <= num3)
      System.out.println("The minimum number is: " + num2);
   else 
      System.out.println("The minimum numer is: " + num3);
    
      }
}

