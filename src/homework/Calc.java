package homework;

import java.util.Scanner;

public class Calc {
    Scanner scanner = new Scanner(System.in);

    public void quadraticSolving() {
        System.out.println("Please enter the first variable for quadratic equation");
        double a = scanner.nextInt();
        System.out.println("Please enter the second variable for quadratic equation");
        double b = scanner.nextInt();
        System.out.println("Please enter the third variable for quadratic equation");
        double c = scanner.nextInt();
        System.out.println("Quadratic solution ax^2 + bx + c = 0");
        System.out.println("when a = " + a + ", b = " + b + " and c = " + c);
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Since the discriminant is less than zero, the equation has no real solutions.");
        } else {
            if (d == 0) {
                double x = -(b / (2 * a));
                System.out.println("Since the discriminant is zero, the quadratic equation has one real root:");
                System.out.println("x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("So as the discriminant is greater than zero, the quadratic equation has two real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        System.out.println("");
    }

//     public void quadraticSolvingViet() {
//         System.out.println("Please enter the second variable for quadratic equation");
//         double b = scanner.nextInt();
//         System.out.println("Please enter the third variable for quadratic equation");
//         double c = scanner.nextInt();
//         System.out.println("Quadratic solution ax^2 + bx + c = 0");
//         System.out.println("when a = 1.0, b = " + b + " and c = " + c);
//        double d = b * b - 4 * c;
//        if (d <= 0) {
//            System.out.println("Дискриминант меньше или равен нулю...");
//        } else {
//
//        }
//    }

    public double getAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public double getCircleLength(double radius) {
        return 2 * Math.PI * radius;
    }

    public void getHypotenuseLength(double cathetus1, double cathetus2) {
        double hypotenuse = Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
        System.out.println("With the length of the cathets " + cathetus1 + " and " + cathetus2 + " the length of the hypotenuse is " + hypotenuse);
        System.out.println();
    }

    public void printFibonacciNumbers() {
        System.out.println("Please enter the Fibonacci sequence length");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Length must be > 0");
        } else {
            int[] numbers = new int[length];
            numbers[0] = 0;
            if (length == 1) {
                System.out.println(numbers[0]);
            } else {
                numbers[1] = 1;
                System.out.print(numbers[0] + ", " + numbers[1] + ", ");
                for (int i = 2; i < numbers.length; i++) {
                    numbers[i] = numbers[i - 1] + numbers[i - 2];
                    System.out.print(numbers[i] + ", ");
                }
            }
        }
        System.out.println();
        System.out.println();
    }

    public void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    public void printTree() {
        System.out.println("Please determine the size of a tree");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
        System.out.println();
    }

    public void printReverseTree() {
        System.out.println("Please determine the size of a reverse tree");
        int size = scanner.nextInt();
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public void printTime() {
        System.out.println("What time is now(hours)?");
        int time = scanner.nextInt();
        if (time > 24 || time < 0) {
            System.out.println("There is no such time");
        } else {
            if (time >= 22 || time <= 3) {
                System.out.println("Good night. Now is " + time + " o'clock");
            } else {
                if (time <= 11) {
                    System.out.println("Good morning. Now is " + time + " o'clock");
                } else {
                    if (time <= 18) {
                        System.out.println("Good day. Now is " + time + " o'clock");
                    } else {
                        System.out.println("Good evening. Now is " + time + " o'clock");
                    }
                }
            }
        }
        System.out.println();
    }

    public void playLoto() {
        System.out.println("Enter you lucky number");
        int num = scanner.nextInt();
        int lucky = 1 + (int) (Math.random() * 20);
        while (num != lucky) {
            System.out.println("Try again");
            num = scanner.nextInt();
        }
        System.out.println("Congratulations! You won!");
        System.out.println();
    }

    public void printOddNumber() {
        System.out.println("Enter first limit");
        int num1 = scanner.nextInt();
        System.out.println("Enter second limit");
        int num2 = scanner.nextInt();
        if (num1 == num2 & num1 % 2 != 0) {
            System.out.println(num1);
        }
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        if (num1 > num2) {
            for (int j = num2; j <= num1; j++) {
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println();
    }

    public void printEvenNumber() {
        System.out.println("Enter first limit");
        int num1 = scanner.nextInt();
        System.out.println("Enter second limit");
        int num2 = scanner.nextInt();
        if (num1 == num2 & num1 % 2 == 0) {
            System.out.println(num1);
        }
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        if (num1 > num2) {
            for (int j = num2; j <= num1; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println();
    }
}






