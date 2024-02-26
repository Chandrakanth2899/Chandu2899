import java.util.Scanner;
public class Discount {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double dis,amount,markedprice,s;
    
    System.out.println("enter markedprice ");
    markedprice=in.nextDouble();
    System.out.println("enter discount percentage ");
    dis=in.nextDouble();
    s=100-dis;
    amount=(s*markedprice)/100;
    System.out.println("amount after discount: " +amount);
  }
}
