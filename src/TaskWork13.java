/*
Задача №13_ Работа с данными
        Напишите программу, где пользователь должен ввести строку из слов,
        разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
        Выведите слова, состоящие только из латиницы.
        Выведите количество этих слов.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scannerStr = new Scanner(System.in);
        String str = scannerStr.nextLine();           //поместил строку в переменную

        String[] allWords = str.split("\\s+");
        List<String> newWords = new ArrayList<String>(); //создание списка, в который будут отправляться слова состоящие из латиницы
        for (int i = 0; i < allWords.length; i++) {
            int letterLength = allWords[i].length(); //длинна текущего слова
            int check = 0;                           //счетчик латинских букв в слове
            for (int j = 0; j < letterLength; j++){
                String letter = allWords[i].substring(j, j + 1);
                if (letter.matches("[a-zA-Z]")) {
                    check++;                         //ПРОВЕРКА: подсчет латинских букв в слове
                }
            }
            if (check == letterLength) {             //слово полностью состоит из латинских букв
                newWords.add(allWords[i]);           //добавление слова в новый список
            }
        }
        for (Object word : newWords) {
            System.out.println("Слово состоящее только из литиницы: " + word);  //вывод латинских слов
        }
        System.out.println("Количество слов состоящих только из латиницы: " + newWords.size()); //вывод количества латинских слов
    }
}
