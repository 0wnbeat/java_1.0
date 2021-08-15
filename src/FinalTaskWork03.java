/*
Итоговая задача № 3
        Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
        Среди данных строк найти строку с максимальным количеством различных символов.
        Если таких строк будет много, то вывести первую.

        Пример для теста работы программы:
        Количество строк: 3
        Строка 1: привет
        Строка 2: анализ
        Строка 3: 111111111111
        Ответ: привет
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalTaskWork03 {
    public static void main(String[] args) {

        System.out.println("Количество строк: ");
        Scanner scannerCount = new Scanner(System.in);
        int countStr = scannerCount.nextInt();

        int count = 0;
        String resultStr = "";

        for (int i = 1; i <= countStr; i++) {
            System.out.println("Строка " + i + ": ");
            Scanner scannerString = new Scanner(System.in);
            String str = scannerString.next();              //поместил строку в переменную

            String[] newArray = str.split("");        //разделение слова на символы в массив
            List<String> eleString = new ArrayList<>();     //создание пустого списка для символов
            for (int j = 0; j < newArray.length; j++) {
                if (!eleString.contains(newArray[j])) {     //сравнение элемента с элементами в списке
                    eleString.add(newArray[j]);             //добавление элемента в список если не находит такой эелемент
                }
            }
            if (count < eleString.size()) {
                count = eleString.size();
                resultStr = str;
            }
        }
        System.out.println("Ответ: " + resultStr);
    }
}
