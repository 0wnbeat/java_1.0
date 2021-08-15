/*
Итоговая задача №2
        Напишите программу, которая позволит решить простое уравнение относительно x.
        Программа принимает на вход строку длиной 5 символов.
        Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
        Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
        Нужно найти неизвестное.

        Пример для теста работы программы:

        Ввод: x+5=7
        Вывод: 2
        Ввод: 3-x=9
        Вывод: -6
        Ввод: 3-3=x
        Вывод: 0
*/

import java.util.Scanner;

public class FinalTaskWork02 {
    public static void main(String[] args) {
        System.out.println("Введите уравнение: ");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.next();
        String[] newArray = equation.split("");

        int result;

        if (newArray[0].matches("[x]")          //x+a=b
                && newArray[1].matches("[\\+]")
                && newArray[2].matches("[0-9]")
                && newArray[3].matches("[\\=]")
                && newArray[4].matches("[0-9]")) {
            result = Integer.parseInt(newArray[4]) - Integer.parseInt(newArray[2]);
            System.out.println("Ответ: х = " + result);
        }

        if (newArray[0].matches("[x]")          //x-a=b
                && newArray[1].matches("[\\-]")
                && newArray[2].matches("[0-9]")
                && newArray[3].matches("[\\=]")
                && newArray[4].matches("[0-9]")) {
            result = Integer.parseInt(newArray[4]) + Integer.parseInt(newArray[2]);
            System.out.println("Ответ: х = " + result);
        }

        if (newArray[0].matches("[0-9]")          //a+x=b
                && newArray[1].matches("[\\+]")
                && newArray[2].matches("[x]")
                && newArray[3].matches("[\\=]")
                && newArray[4].matches("[0-9]")) {
            result = Integer.parseInt(newArray[0]) - Integer.parseInt(newArray[4]);
            System.out.println("Ответ: х = " + result);
        }

        if (newArray[0].matches("[0-9]")          //a-x=b
                && newArray[1].matches("[\\-]")
                && newArray[2].matches("[x]")
                && newArray[3].matches("[\\=]")
                && newArray[4].matches("[0-9]")) {
            result = Integer.parseInt(newArray[0]) - Integer.parseInt(newArray[4]);
            System.out.println("Ответ: х = " + result);
        }

        if (newArray[0].matches("[0-9]")          //a+b=x
                && newArray[1].matches("[\\+]")
                && newArray[2].matches("[0-9]")
                && newArray[3].matches("[\\=]")
                && newArray[4].matches("[x]")) {
            result = Integer.parseInt(newArray[0]) + Integer.parseInt(newArray[2]);
            System.out.println("Ответ: х = " + result);
        }

        if (newArray[0].matches("[0-9]")          //a-b=x
                && newArray[1].matches("[\\-]")
                && newArray[2].matches("[0-9]")
                && newArray[3].matches("[\\=]")
                && newArray[4].matches("[x]")) {
            result = Integer.parseInt(newArray[0]) - Integer.parseInt(newArray[2]);
            System.out.println("Ответ: х = " + result);
        }
    }
}
