package stringex;

public class Findindexstring {
    public static void main(String[] args) {
        String string1 = "Chandu";
        char find = 'r'; boolean flag = true;
        for(int i=0;i<string1.length();i++)
        {
            if (find == string1.charAt(i)) {
                System.out.println("Found at index : "+i);
                flag = false;
            }
        }
        if (flag==true) {
            System.out.println("Not Found");
            
        }
    }
    
}
