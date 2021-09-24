package ru.progwards.java1.lessons.basics;


public class AccuracyDoubleFloat {
    static final double PI = 3.14;

    public static double volumeBallDouble(double radius) {
        return 4.0/3.0*PI*(radius*radius*radius);
    }

    public static float volumeBallFloat(float radius) {
        return (float) (4.0/3.0*PI*(radius*radius*radius));
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float)radius);
    }
}

//    Проведём простое исследование типов double и float на разницу в точности. Посчитаем объём земли в кубических километрах двумя сходными функциями. Одна из них будет основана на типе double, а вторая на менее точном типе float.
//    После чего мы сможем узнать разницу между этими значениями в кубических километрах. Радиус земли R будем считать равным 6371.2 км (для проверки работы методов используйте это значение), а число π возьмём равным 3.14
//        Формула объёма шара 4/3πR3. Для решения задачи следует.
//        3.1 Реализовать функцию
//public static double volumeBallDouble(double radius), которая будет возвращать объём шара с радиусом radius и основана на типе double.
//        3.2 Реализовать функцию
//public static float volumeBallFloat(float radius), которая будет возвращать объём шара с радиусом radius и основана на типе float.
//        3.3 Реализовать функцию
//public static double calculateAccuracy(double radius), которая будет возвращать разницу между функциями volumeBallDouble и volumeBallFloat (они должны быть вызваны из неё с параметром radius).

//        Рекомендации:
//        вспомните, каким символом заканчиваются константы типа float в Java;
//        в функции calculateAccuracy для получения значения типа float из параметра типа double используйте конструкцию: (float) radius;
//        после создания функций для вычисления объёма проверьте результат на радиусе равном 1, если функция вернёт Pi, то думайте... .