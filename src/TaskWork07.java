/*
Задача №7_ Циклы
        Напишите программу:

        Пользователь вводит размер массива и данные с клавиатуры в массив

        Сравнить элементы массива с заранее заданными константами x, y, z.

        Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
*/

import java.util.Scanner;

public class TaskWork07 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scannerLengthMyArray = new Scanner(System.in);
        int lengthMyArray = scannerLengthMyArray.nextInt();
        int[] myArray = new int[lengthMyArray];
        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 0; i < lengthMyArray; i++){
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            Scanner scannerMyArray = new Scanner(System.in);
            myArray[i] = scannerMyArray.nextInt();

            if (myArray[i] == a || myArray[i] == b || myArray[i] == c) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}
