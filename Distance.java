import java.util.Scanner;
public class Distance {
     public static void main(String args[]) {
       Scanner in = new Scanner(System.in);

          float km,metres,cm;
          System.out.print("Enter The Kilo Meters: ");
          km = in.nextFloat();
          System.out.print("Enter the metres: ");
          metres = in.nextFloat();
          System.out.print("Enter the cm: ");
          cm = in.nextFloat();
          metres=km*1000;
          cm=km*100000;
          System.out.println("The Output 1 is: " +metres);
          System.out.println("The Output 2 is: " +cm);
      }
}
