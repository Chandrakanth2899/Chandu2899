import java.util.Scanner;
public class Multiply {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int num = in.nextInt();
    
    if (num % 5 == 0)
    System.out.println(num + " is multiple of 5");
    else 
    System.out.println(num + " is not multiple of 5");

      }
 }
