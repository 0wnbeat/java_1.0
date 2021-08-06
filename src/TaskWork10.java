/*
Задача №10_Циклы
        Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
        а после этого произведите вывод первой строки матрицы на экран,
        где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
*/

import java.util.Scanner;

public class TaskWork10 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк в матрице:");
        Scanner scannerStrings = new Scanner(System.in);
        int str = scannerStrings.nextInt();
        System.out.println("Введите количество столбцов в матрице:");
        Scanner scannerColumns = new Scanner(System.in);
        int col = scannerColumns.nextInt();
        int [][] allElements = new int[str][col];

        for (int i = 0; i < str; i++) {
            for (int j = 0; j < col; j++){
                System.out.println("Ввкдите [" + i + ", " + j + "] элемент:");
                Scanner scannerElement = new Scanner(System.in);
                int ele = scannerElement.nextInt();
                allElements[i][j] = ele;
            }
        }

        System.out.print("Первая строка в матрице: " );
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < col; j++){
                System.out.print(allElements[i][j] + "\t");
            }
        }
    }
}
