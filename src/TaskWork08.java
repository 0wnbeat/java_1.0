/*
Задача №8_ Циклы
        Напишите программу, где пользователь вводит любое целое положительное число n.
        А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
*/


import java.util.Scanner;

public class TaskWork08 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число:");
        Scanner scannerN = new Scanner(System.in);
        long n = scannerN.nextLong();
        int result = 0;

        for (int i = 1; i <= n; i += 2) {
            result += i;
        }

        if (result > 0) {
            System.out.println("Сумма нечетных чисел равна " + result);
        }
    }
}
