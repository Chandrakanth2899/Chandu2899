import java.util.Scanner; 
public class Factorial { 
     public static void main(String []args) { 
        
        Scanner in=new Scanner(System.in); 
        //Declare and Initialize the variable 
        System.out.println("Enter the number: "); 
        int num=in.nextInt(); 
        int i=1,fact=1;
        while (i<=num)
        {
          fact=fact*i;
          i++;
        }
        System.out.println("Factorial of the number: "+fact);   
     }    
} 
