import java.util.Scanner;
public class Emi {
public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		double pri, rate, time, emi;
		System.out.print("Enter the Principal : ");
		pri = in.nextFloat();
		System.out.print("Enter the Rate : ");
		rate = in.nextFloat();
		System.out.print("Enter Time in Year : ");
		time = in.nextFloat();
 
		rate = rate/(12*100);	//one month interest
		time = time*12;		//one month period
		emi = (pri*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
 
		System.out.print("Monthly EMI is : "+ emi);
	}
}
