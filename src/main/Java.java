package main;

import java.util.Locale;

public class Java {

    public static void main(String[] args) {
        char s = 's';
        byte aByte = 8;
        short aShort = 16;
        int aInt = 32;
        long aLong = 64;
        float aFloat = 32.32F;
        double aDouble = 64.64D;
        String name = "First Java";

        System.out.println("+ result" + aByte + " и " + aInt + " = " + sum(aByte, aInt));
        System.out.println("- result" + aByte + " из " + aInt + " = " + diff(aInt, aByte));
        System.out.println("* result" + aShort + " на " + aByte + " = " +  multiplication(aShort, aByte));
        System.out.println("/ result" + aLong + " на " + aByte + " = " + divide((int) aLong, aByte));
        System.out.println("% result" + aInt + " на " + 10 + " = " + modulo(aInt, 10));

        System.out.println("+ result" + aFloat + " и " + aDouble + " = " + sum(aFloat, aDouble));

        System.out.println(name.toUpperCase());
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int diff(int a, int b) {
        return a - b;
    }
    static int multiplication(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    static int modulo(int a, int b) {
        return a % b;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
