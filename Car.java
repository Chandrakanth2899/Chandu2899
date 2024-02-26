abstract class Car {
   abstract void move();
}

class driver {
      Void drives(Car car) {
         Car.move();
   }
}

Class BasicCar extends Car {
   @Override
   Void move() {
      System.out.println(“Car is moving”);
   }
}

public class Main {
    Public static void main(String[] args) {
         Driver driver = new Driver();
         BasicCar myCar = new BasicCar();

         driver.drives(myCar);
     }
}
