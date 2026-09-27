package ru.university.lab2.numbers;

public class Task01IntegerTraps {
    public void run() {
        printRanges();
        overflowMaxValue();
        multiplyMaxValue();
        integerDivisionAndModulo();
        longToIntNarrowing();
        charArithmetic();
        demonstrateAddWithOverflowCheck();
    }
    private void printRanges() {
        System.out.println("byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
    }
    private void overflowMaxValue() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println("Integer.MAX_VALUE + 1 = " + y);
    }
    private void multiplyMaxValue() {
        int intResult = Integer.MAX_VALUE * 2;
        long longResult = Integer.MAX_VALUE * 2L;
        System.out.println("int: " + intResult);
        System.out.println("long: " + longResult);
    }
    private void integerDivisionAndModulo() {
        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("-5 / 2 = " + (-5 / 2));
        System.out.println("5 % 2 = " + (5 % 2));
        System.out.println("-5 % 2 = " + (-5 % 2));
    }
    private void longToIntNarrowing() {
        long big = Integer.MAX_VALUE + 10L;
        int narrowed = (int) big;
        System.out.println("long = " + big + ", (int) = " + narrowed);
    }
    private void charArithmetic() {
        char a = 'A';
        char next = (char) (a + 1);
        int sum = 'A' + 'B';
        System.out.println("next = " + next);
        System.out.println("'A' + 'B' as int = " + sum);
        System.out.println("as char = " + (char) sum);
    }
    private void demonstrateAddWithOverflowCheck() {
        addWithOverflowCheck(2_000_000_000, 2_000_000_000);
        addWithOverflowCheck(10, 20);
    }
    private void addWithOverflowCheck(int a, int b) {
        int sum = a + b;
        boolean overflow;
        if (b > 0) {
            overflow = sum < a;
        } else {
            overflow = sum > a;
        }
        System.out.println(a + " + " + b + " = " + sum + ", overflow = " + overflow);
    }
}