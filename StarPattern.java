import java.util.Scanner;
public class StarPattern {
   public static void main(String[] args) {
     
   int i,j,num;
   System.out.print("Input number of rows : ");
   Scanner in = new Scanner(System.in);
		    num = in.nextInt();

   for(i=1;i<=num;i++)
   {
	for(j=1;j<=i;j++)
	  System.out.print(" * ");

    System.out.println("");
    }
  }
}
