/*
Итоговая задача №4
        Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает,
        тот слезы проливает”. Ответ: “Заархивированный вирус”.
        У пользователя есть 3 попытки, чтобы отгадать загадку.
        Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
        Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
        Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
        Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
        Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку.
        Если на 2 и 3, вывести “Подсказка уже недоступна”.
        Если пользователь, использовавший подсказку, ошибется, вывести “Обидно, приходи в другой раз” и завершить работу.
*/

import java.util.Scanner;

public class FinalTaskWork04 {
    public static void main(String[] args) {
        String question = "Загадка:\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.";
        String answer = "Заархивированный вирус";
        String yourAnswer = "Ваш ответ: ";
        String requestClue = "Подсказка";
        String clue = "Вот тебе подсказка: звучит как лекарство";
        String right = "Верно!";
        String anotherOne = "Подумай еще!";
        String clueUnavailable = "Подсказка уже недоступна.";
        String wrong = "Обидно, приходи в другой раз.";

        Scanner scanner1 = new Scanner(System.in);
        int retriesLeft = 3;

        System.out.println(question);
        System.out.println(yourAnswer);


        while (retriesLeft != 0) {
            String input = scanner1.nextLine();

            if (input.equals(requestClue)) {
                if (retriesLeft == 3) {
                    System.out.println(clue);
                    System.out.println(yourAnswer);
                    retriesLeft = retriesLeft - 2;
                } else {
                    System.out.println(clueUnavailable);
                }

            } else {
                if (input.equals(answer)) {
                    System.out.println(right);
                    return;
                }

                retriesLeft = retriesLeft - 1;
                if (retriesLeft != 0) {
                    System.out.println(anotherOne + " Осталось попыток: " + retriesLeft);
                }
            }
        }

        System.out.println(wrong);








        /*
        System.out.println();
        String answer = "Заархивированный вирус";
        String yourAnswer = "Ваш ответ: ";
        String clue = "Подсказка";
        String right = "Верно!";
        String anotherOne = "Подумай еще!";
        String cloeUnavailable = "Подсказка уже недоступна.";
        String wrong = "Обидно, приходи в другой раз.";

        System.out.println("Попытка 1 " + yourAnswer);
        Scanner scanner1 = new Scanner(System.in);
        String str1 = scanner1.nextLine();
        int chance = 0;

        if (str1.equals(answer)) {                               //1 попытка, без подсказки
            System.out.println(right);
            chance++;
        }
        for (int i = 1; i < 4; i++) {
            if (i == 1 && chance == 0 && str1.equals(clue)) {    //1 попытка, взяли подсказку
                while (chance == 0) {
                    System.out.println("Вот тебе подсказка: звучит как лекарство.\n" + "Попытка 1 " + yourAnswer);
                    Scanner scanner2 = new Scanner(System.in);
                    String str2 = scanner2.nextLine();
                    if (str2.equals(answer)) {
                        System.out.println(right);
                        chance++;
                    } else {
                        System.out.println(wrong);
                        chance++;
                    }
                }
            }

            if (i == 2 && chance == 0) {                         //2 попытка
                while (chance == 0) {
                    System.out.println(anotherOne + " Попытка 2 " + yourAnswer);
                    Scanner scanner5 = new Scanner(System.in);
                    String str5 = scanner5.nextLine();
                    if (str5.equals(clue)) {
                        System.out.println(cloeUnavailable);
                    } else if (str5.equals(answer)) {
                        System.out.println(right);
                        chance++;
                    }
                }
            }
            if (i == 3 && chance == 0) {                         //3 попытка
                while (chance == 0) {
                    System.out.println(anotherOne + " Попытка 3 " + yourAnswer);
                    Scanner scanner6 = new Scanner(System.in);
                    String str6 = scanner6.nextLine();
                    if (str6.equals(clue)) {
                        System.out.println(cloeUnavailable);
                    } else if (str6.equals(answer)) {
                        System.out.println(right);
                        chance++;
                    } else {
                        System.out.println(wrong);
                    }
                }
            }
        }*/




    }
}
