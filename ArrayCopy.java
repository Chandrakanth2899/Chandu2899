public class ArrayCopy { 
    public static void main(String[] args) 
    { 
        int a[] = { 2, 8, 3 }; 
  
        // Create an array b[] of same size as a[] 
        int b[] = new int[a.length]; 
  
        // Doesn't copy elements of a[] to b[], 
        // only makes b refer to same location 
        b = a;
        
        System.out.println("Elements of a[] "); 
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " "); 
      
        System.out.println("\nElements of b[] "); 
        for (int i = 0; i < b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
}
