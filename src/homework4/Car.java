package homework4;

import java.util.Arrays;
import java.util.Objects;

public class Car extends Agregat {
    private String mark;
    private String model;
    private Engine engine;
    private Passenger[] passengers;
    private int capacity;
    private int fuel;

    public Car(int weight, String type, String countryOfProduction, String mark, String model, Engine engine, Passenger[] passengers, int capacity, int fuel) {
        super(weight, type, countryOfProduction);
        this.mark = mark;
        this.model = model;
        this.engine = engine;
        this.passengers = passengers;
        this.capacity = capacity;
        this.fuel = fuel;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capacity == car.capacity &&
                fuel == car.fuel &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(passengers, car.passengers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mark, model, engine, capacity, fuel);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", passengers=" + Arrays.toString(passengers) +
                ", capacity=" + capacity +
                ", fuel=" + fuel +
                '}';
    }
}
