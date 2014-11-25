package com.informind;


public class SquareRoot {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;
        double t = c;

        while (Math.abs(t - c/t) > epsilon*t) {
            System.out.println("T: " + t);
            System.out.println("C: " + c);
            t = (c / t + t) / 2.0;
        }
        System.out.println("Result: " + t);
    }
}
