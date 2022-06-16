package com.company;

/*
    ДЗ №3 Базовые типы данных и работа с ними
    Задание №2.
    Запись большого числа с разделителем "_".
 */

public class BigNum {
    public static void main(String[] args) {

        int a = 10_000_000;
        double b = 100.066_123_455;
        double c = 15_500_088.4_433_112_201;

        System.out.println("Значение \"a\": " + a);
        System.out.println("Значение \"b\": " + b);
        System.out.println("Значение \"c\": " + c);
    }
}
