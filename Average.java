import java.util.Scanner;

public class Average {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.println("The average value is " + (x + y + z)/3);
    }
 
}
