import java.util.Scanner;
public class BinaryFormat {
    public static void main(String[] args) {
      
        int n,m;
        String x = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        n = in.nextInt();
      
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
    }
}
