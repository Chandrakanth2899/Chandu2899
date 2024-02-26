import java.util.Scanner;
public class Time {
     public static void main(String args[]) {
       Scanner in = new Scanner(System.in);

          int hours,minutes,seconds;
          System.out.print("Enter The hours: ");
          hours = in.nextInt();
          System.out.print("Enter the minutes: ");
          minutes = in.nextInt();
          System.out.print("Enter the seconds: ");
          seconds = in.nextInt();
          minutes=hours*60;
          seconds=hours*3600;
          System.out.println("The Output 1 is: " +minutes);
          System.out.println("The Output 2 is: " +seconds);
      }
}
