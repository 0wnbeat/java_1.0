/*
Задача №11_Работа с данными
        Напишите программу:
        Ввести первое  число с клавиатуры и записать его в строковую переменную.
        Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        Сравнить 2 числа и вывести большее на экран .
        Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/

import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scannerStr = new Scanner(System.in);
        String strNum = scannerStr.next();

        System.out.println("Введите второе число: ");
        Scanner scannerInt = new Scanner(System.in);
        int intNum = scannerInt.nextInt();

        int strToInt = Integer.parseInt(strNum);

        if (strToInt > intNum) {
            double firstToDouble = intNum;
            System.out.println("Первое число больше второго.\nБольшее число: " + strToInt + "\nМеньшее число: " + firstToDouble);
        } else if (strToInt < intNum) {
            double firstToDouble = strToInt;
            System.out.println("Первое число меньше второго.\nБольшее число: " + intNum + "\nМеньшее число: " + firstToDouble);
        } else {
            System.out.println("Первое число равно второму. Число: " + strToInt);
        }
    }
}
