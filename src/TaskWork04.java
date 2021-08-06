/*
Задача №4_Операторы
        Написать программу, которая будет выполнять следующие действия:

        Ввести три числа с клавиатуры x, y, z
        Найти и вывести в консоль среднее арифметическое этих чисел.
        Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/

import java.util.Scanner;

public class TaskWork04 {
    public static void main(String[] args) {
        System.out.println("Введите x, y, z:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int avg = (x + y + z) / 3; //Находим среднее арифметическое
        System.out.println("Среднее арифметическое этих чисел: " + avg);

        long avgHalf = Math.round(Math.floor(avg / 2));//Делим среднее арифметическое на 2 и округляем в меньшую сторону
        if (avgHalf > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
