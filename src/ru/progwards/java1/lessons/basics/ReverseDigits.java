package ru.progwards.java1.lessons.basics;


public class ReverseDigits {
    public static int reverseDigits(int number) {
        int units = number%10;
        int dozens = number%100/10;
        int hundreds = number/100;
        int newNumber = units*100 + dozens*10 + hundreds;
        return newNumber;
    }
}

//    public static int reverseDigits(int number), которая получает параметром number трёхзначное положительное число, а вернуть должна число в котором цифры идут в обратном порядке
//    (например, если на вход передаётся 123, то функция должна вернуть 321).
//    Рекомендации:
//   для реализации задачи вспомните особенности деления в Java (в середине лекции "БНФ, константы, операторы, приоритеты")
//    Для тестирования решения используйте функцию main, и проверьте как минимум 3 значения, например 123, 456, 789

