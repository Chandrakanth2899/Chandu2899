import java.util.Arrays; 
  
public class Index { 
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println(findindex(arr, 5));
  }
  
  public static int findindex(int[] arr,int value ) {
    for (int i=0; i<arr.length; i++) {
      if (arr[i] == value) {
        return i;
      }
    }
      return -1;
    
  }
}
