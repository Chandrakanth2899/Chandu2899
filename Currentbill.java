import java.util.Scanner;
public class Currentbill {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int units = 340;
    double billpay = 0;
    
    if (units >= 1 && units <= 100) {
      billpay = units*3.0;
      
    } else if (units > 101 && units <= 200) {
      billpay = 101*3.0+(units-100)*4.0;
      
    } else if (units > 201 && units <= 300) {
      billpay = 101*3.0+201*4.0+(units-300)*5.0;
      
    }  else if (units > 301) {
        billpay = 101*3.0+201*4.0+300.50+(units-301)*6.0;
    }
    
    System.out.println("Bill to pay: " + billpay);
    
      }
}
