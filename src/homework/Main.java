package homework;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.quad(4, 7, 5);
        calc.quad(9, 6, 1);
        calc.quad(3, -4, 1);
        System.out.println("Площадь круга  с радиусом 44 = " + calc.areaOfCircle(44));
        System.out.println("Длина круга  с радиусом 44 = " + calc.circleLength(44));
        calc.triangle(57, 89);
        calc.triangle(44, 44);
        calc.triangle(85, 1);
        calc.triangle(13, 47);
    }
}
