public class Shapes {
  public static void main(String[] args) {
    int length = 5;  
    int width = 2;
    int height = 6;
    int base = 9;
    int radius = 4;
    int pi = 22/7;
    int area = 8;
    int side = 4;
    
    int areaCircle = pi * radius * radius;
    int perimeterCircle = 2 * pi * radius;
    int areaSquare = side * side;
    int perimeterSquare = 4 * side;
    int areaParallelogram = base * height;
    int perimeterParallelogram = 2 * (side + base);
    
    System.out.println("Area of circle: " + areaCircle);  
    System.out.println("Perimeter of circle: " + perimeterCircle);
    System.out.println("Area of square: " + areaSquare);  
    System.out.println("Perimeter of square: " + perimeterSquare);
    System.out.println("Area of parallelogram: " + areaParallelogram);  
    System.out.println("Perimeter of parallelogram: " + perimeterParallelogram);

  }
}
