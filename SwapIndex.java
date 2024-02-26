public class SwapIndex {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        
        System.out.println("Array before Swap" + "\n");
        for (int element : arr) {
            System.out.println(element);
        }

        //Simple Swapping logic
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        
        System.out.println("\n" + "Array after Swap" + "\n");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
