import java.util.Scanner;
public class Armstrong {
  public static void main(String[] args) {
    int originalNum,digit,cubeSum=0,num;
    
    System.out.println("Enter the number");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    originalNum = num;
    
    while (num != 0)
    {
      digit = num%10;
      cubeSum+= Math.pow(digit,3);
      num/=10;
    }
    
    if (cubeSum == originalNum)
       System.out.println("Armstrong number is " + originalNum);
       else
       System.out.println(originalNum + “ is not an Armstrong number");
          
    }
 }
