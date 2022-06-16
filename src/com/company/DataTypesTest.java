package com.company;

/*
    ДЗ №3 Базовые типы данных и работа с ними
    Задание №1.
    Обьявление и инициализация примитивных типов данных с выводом значений в консоль.
 */

public class DataTypesTest {
    public static void main(String[] args) {

        byte a = 125;
        short b = 3500;
        int c = 555_555_555;
        long d = 35_000_000_000_000L;
        float e = 350_555.343f;
        double f = 666_563.234_345;
        char g = 'W';
        char j = '\u00A5';
        boolean k = false;
        boolean l = true;

        System.out.println("Значение переменной \"a\" типа byte: " + a);
        System.out.println("Значение переменной \"b\" типа short: " + b);
        System.out.println("Значение переменной \"c\" типа int: " + c);
        System.out.println("Значение переменной \"d\" типа long: " + d);
        System.out.println("Значение переменной \"e\" типа float: " + e);
        System.out.println("Значение переменной \"f\" типа double: " + f);
        System.out.println("Значение переменной \"g\" типа char: " + g);
        System.out.println("Значение переменной \"j\" типа char: " + j);
        System.out.println("Значение переменной \"k\" типа boolean: " + k);
        System.out.println("Значение переменной \"l\" типа boolean: " + l);


    }
}
