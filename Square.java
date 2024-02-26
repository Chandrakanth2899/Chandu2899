import java.util.Scanner;
public class Square {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    Double num = in.nextDouble();
    
    Double square = num*num;
    System.out.println("Square of " +num+ " is: " + square );
    
      }
 }
