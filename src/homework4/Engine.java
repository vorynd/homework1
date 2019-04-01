package homework4;

import java.util.Objects;

public class Engine {
    private int speed;
    private int horsepower;

    public Engine(int speed, int horsepower) {
        this.speed = speed;
        this.horsepower = horsepower;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return speed == engine.speed &&
                horsepower == engine.horsepower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, horsepower);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "speed=" + speed +
                ", horsepower=" + horsepower +
                '}';
    }

}
