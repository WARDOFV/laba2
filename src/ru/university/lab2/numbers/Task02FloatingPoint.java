package ru.university.lab2.numbers;

public class Task02FloatingPoint {

    public void run() {
        printSumProblemm();
        sumTenTimes();
        compareWithEpsilonDemo();
        infinityAndNaN();
        roundingDemo();
        floatVsDouble();
    }

    private void printSumProblemm() {
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));

    }

    private void sumTenTimes() {
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        System.out.println("sum = " + sum);
        System.out.println("sum == 1.0 ? " + (sum == 1.0));
    }

    private void compareWithEpsilonDemo() {
        double a = 0.1 + 0.2;
        double b = 0.3;
        System.out.println("equalsWithEpsilon = " + equalsWithEpsilon(a, b, 1e-9));
    }

    private boolean equalsWithEpsilon(double a, double b, double eps) {
        return Math.abs(a - b) <= eps;
    }

    private void infinityAndNaN() {
        double inf = 1.0 / 0.0;
        double negInf = -1.0 / 0.0;
        double nan = 0.0 / 0.0;
        System.out.println(inf + ", " + negInf + ", " + nan);
        System.out.println("NaN == NaN ? " + (nan == nan));
    }

    private void roundingDemo() {
        double[] values = {2.7, -2.7};
        for (double v : values) {
            System.out.println("v = " + v);
            System.out.println("(int) = " + (int) v);
            System.out.println("round = " + Math.round(v));
            System.out.println("floor = " + Math.floor(v));
            System.out.println("ceil = " + Math.ceil(v));
        }
    }

    private void floatVsDouble() {
        float f = 0.1f + 0.2f;
        double d = 0.1 + 0.2;
        System.out.println("float = " + f);
        System.out.println("double = " + d);
    }
}