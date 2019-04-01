package homework4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2000, "Auto", "Japan", "Mitsubishi", "Outlander", new Engine(150, 600), new Passenger[3], 4, 200);

        Passenger passenger = new Passenger("John", 25);
        Passenger passenger1 = new Passenger("David", 25);
        Passenger passenger2 = new Passenger("Abdul", 25);

        Util util = new Util();

        int distance = (int) (Math.random() * 1000);

        if (util.rideOnDistance(car, distance)) {

            util.sitInCar(car, passenger);
            util.sitInCar(car, passenger1);
            util.sitInCar(car, passenger2);

            util.startEngine(car);
            util.toRide(car);

            int picnicDistance = (int) (Math.random() * distance);
            util.picnic(picnicDistance, car);

            util.getOutOfCar(car, passenger);
            util.getOutOfCar(car, 2);

            util.toEatFood(passenger);
            util.toEatFood(passenger2);

            util.sitInCar(car, passenger);
            util.sitInCar(car, passenger2);

            util.startEngine(car);
            util.toRide(car);

            System.out.println("Arrived on " + distance);

            util.stopEngine(car);

            util.getOutOfCar(car,0);
            util.getOutOfCar(car,1);
            util.getOutOfCar(car,2);

        } else {
            System.out.println("Cannot ride on car, please use airplane.");
        }
    }
}
