/*
Задача №9_ Циклы
        Напишите программу:
        Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        Посчитайте среднее арифметическое элементов массива.
        После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
*/
import java.util.Scanner;

public class TaskWork09 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scannerLengthMyArray = new Scanner(System.in);
        int lengthMyArray = scannerLengthMyArray.nextInt();
        double[] myArray = new double[lengthMyArray];
        double sum = 0;

        for (int i = 0; i < lengthMyArray; i++){
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            Scanner scannerMyArray = new Scanner(System.in);
            myArray[i] = scannerMyArray.nextDouble();
            sum += myArray[i];
        }
        double avg = sum / lengthMyArray;

        for (int i = 0; i < lengthMyArray; i++) {
            System.out.println(myArray[i] * avg);
        }
    }
}