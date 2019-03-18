package homework;

public class Calc {
    public void quad(double a, double b, double c) {
        System.out.println("Решение квадратного уравнения ax^2 + bx + c = 0");
        System.out.println("при a = " + a + ", b = " + b + " и c = " + c);
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Так как дискриминант меньше нуля, то уравнение не имеет действительных решений.");
        } else {
            if (d == 0) {
                double x = -(b / (2 * a));
                System.out.println("Так как дискриминант равен нулю то, квадратное уравнение имеет один действительный корень:");
                System.out.println("x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("Так как дискриминант больше нуля то, квадратное уравнение имеет два действительных корня:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        System.out.println("");
    }

//     public double[] viet(double b, double c) {
//        double d = b * b - 4 * c;
//        if (d <= 0) {
//            System.out.println("Дискриминант меньше или равен нулю...");
//        }
//    }

    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public double circleLength(double radius) {
        return 2 * Math.PI * radius;
    }

    public void triangle(double cathetus1, double cathetus2) {
        double hypotenuse = Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
        System.out.println("При длине катетов " + cathetus1 + " и " + cathetus2 + " длина гипотенузы равна " + hypotenuse);
    }
}
