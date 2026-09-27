package ru.university.lab2.numbers;

public class Task03Bitwise {

    public void run() {
        showOperators();
        explainShiftDifference();
        parityPowerOfTwoBitCount();
        swapWithXor();
    }

    private void showOperators() {
        int a = 5;
        int b = 3;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));
    }

    private void explainShiftDifference() {
        int x = -8;
        System.out.println("-8 >> 1 = " + (x >> 1));
        System.out.println("-8 >>> 1 = " + (x >>> 1));
    }

    private void parityPowerOfTwoBitCount() {
        System.out.println("isEven(4) = " + isEven(4));
        System.out.println("isPowerOfTwo(16) = " + isPowerOfTwo(16));
        System.out.println("countBits(13) = " + countBits(13));
    }

    private boolean isEven(int x) {
        return (x & 1) == 0;
    }

    private boolean isPowerOfTwo(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }

    private int countBits(int x) {
        int count = 0;
        while (x != 0) {
            count += x & 1;
            x >>>= 1;
        }
        return count;
    }

    private void swapWithXor() {
        int a = 5;
        int b = 7;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + ", b = " + b);
    }
}



