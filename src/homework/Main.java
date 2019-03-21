package homework;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        calc.quadraticSolving();
//        calc.quadraticSolvingViet();
        System.out.println("Area of a circle with a radius 44 = " + calc.getAreaOfCircle(44));
        System.out.println("The length of the circle with a radius 44 = " + calc.getCircleLength(44));
        calc.getHypotenuseLength(45, 25);
        calc.printFibonacciNumbers();
        calc.printMultiplicationTable();
        calc.printTree();
        calc.printReverseTree();
        calc.printTime();
        calc.playLoto();
        calc.printOddNumber();
        calc.printEvenNumber();
    }
}
