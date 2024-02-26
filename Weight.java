import java.util.Scanner;
public class Weight {
     public static void main(String args[]) {
       Scanner in = new Scanner(System.in);

          float kg,grams;
          System.out.print("Enter The kg: ");
          kg = in.nextFloat();
          System.out.print("Enter the grams: ");
          grams = in.nextFloat();
          grams = kg*100;
          System.out.println("The Output 1 is: " +grams);
      }
}
