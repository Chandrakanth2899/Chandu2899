import java.util.Scanner;
public class Bmi {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input your weight in kg: ");
    double weight = in.nextDouble();
    System.out.println("Input your height in inches: ");
    double inches = in.nextDouble();

    double BMI = weight* 1000.0/(inches * 0.0254 * inches * 0.0254);
    System.out.println("Body mass index is: " +BMI);
  }
}
