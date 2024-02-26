import java.util.Scanner;
public class Grade {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String grade;
    
    System.out.println("Enter average of the grade: ");
    int average = in.nextInt();
    
    if (average >= 75) {
      grade = "distinction";
      } else if (average >= 65 && average < 75) {
        grade = "firstclass";
      } else if (average >= 60 && average < 65) {
          grade = "secondclass";
      } 
      else {
          grade = "thirdclass";
      } 
      
System.out.println("your grade is " + grade);
        
    }
}
