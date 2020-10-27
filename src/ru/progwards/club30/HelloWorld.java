package ru.progwards.club30;

public class HelloWorld {
    static void helloWorld() {
        System.out.println("Привет, мир!");

    }
    public static void main(String[] args) {
        helloWorld();
        HelloWorld.helloWorld();
        ru.progwards.club30.HelloWorld.helloWorld();
    }
}
