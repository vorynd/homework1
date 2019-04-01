package homework4;

public class Util {

    public void sitInCar(Car car, Passenger passenger) {
        //  if (car.getCapacity() > 1 && car.getCapacity() <= 4) {
        for (int numberOfPlace = 0; numberOfPlace < car.getPassengers().length; numberOfPlace++) {
            if (car.getPassengers()[numberOfPlace] == null) {
                car.getPassengers()[numberOfPlace] = passenger;
                System.out.println(passenger.getName() + " sit in the car.");
                break;
            }
            if (numberOfPlace == car.getPassengers().length - 1) {
                System.out.println("Sorry, our car is full");
            }
        }
    }

    public void getOutOfCar(Car car, Passenger passager) {
        for (int numberOfPlace = 0; numberOfPlace < car.getPassengers().length; numberOfPlace++) {
            if (car.getPassengers()[numberOfPlace] == passager) {
                car.getPassengers()[numberOfPlace] = null;
                System.out.println(passager.getName() + " has left the car. His place is now free!");
                break;
            }
            if (numberOfPlace == car.getPassengers().length - 1) {
                System.out.println(passager.getName() + " not found in the car.");
            }
        }
    }

    public void getOutOfCar(Car car, int passengerIndex) {
        if (car.getPassengers()[passengerIndex] == null) {
            System.out.println("Sorry, mo passenger found on place " + passengerIndex);
        } else {
            System.out.println(car.getPassengers()[passengerIndex].getName() + " has left the car. His place is now free!!");
            car.getPassengers()[passengerIndex] = null;
        }
    }

    public void startEngine(Car car) {
        System.out.println("Start engine of " + car.getMark() + " " + car.getModel());
    }

    public void stopEngine(Car car) {
        System.out.println("Stop engine of " + car.getMark() + " " + car.getModel());
    }

    public void toEatFood(Passenger passenger) {
        System.out.println(passenger.getName() + " eating food.");
    }

    public void toRide(Car car) {
        System.out.println(car.getMark() + " " + car.getModel() + " rides");
    }

    public boolean rideOnDistance(Car car, int distance) {
        double fuelNeeded = (double) distance / 10 * (double) car.getEngine().getHorsepower() / 1000 * car.getEngine().getSpeed() * 0.2;
        boolean canRide = car.getFuel() >= fuelNeeded;
        if (canRide) {
            System.out.println("We can ride on " + distance + " km.");
        } else {
            System.out.println("We can not ride on " + distance + " km.");
        }
        return canRide;
    }

    public void picnic(int picnicDistance, Car car) {
        stopEngine(car);
        System.out.println("Car stopped on picnic on " + picnicDistance + " km");
    }
}

