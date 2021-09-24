package ru.progwards.java1.lessons.basics;


public class Astronomy {
    static final double PI = 3.14;
    static final double EARTH_RADIUS = 6371.2;
    static final double MERCURY_RADIUS = 2439.7;
    static final double JUPITER_RADIUS = 71492;

    public static Double sphereSquare(Double r) {
        return 4 * PI * r * r;
    }

    public static Double earthSquare() {
        return 4 * PI * EARTH_RADIUS * EARTH_RADIUS;
    }

    public static Double mercurySquare() {
        return 4 * PI * MERCURY_RADIUS * MERCURY_RADIUS;
    }

    public static Double jupiterSquare() {
        return 4 * PI * JUPITER_RADIUS * JUPITER_RADIUS;
    }

    public static Double earthVsMercury() {
        return earthSquare() - mercurySquare();
    }

    public static Double earthVsJupiter() {
        return earthSquare() - jupiterSquare();
    }

    static int addAsStrings(int n1, int n2) {
        return Integer.parseInt(Integer.toString(n1) + Integer.toString(n2));
    }
}


//    public static void main(String[] args) {
//        System.out.println(earthSquare());
//        System.out.println(mercurySquare());
//        System.out.println(jupiterSquare());
//        System.out.println(earthVsMercury());
//        System.out.println(earthVsJupiter());
//    }
