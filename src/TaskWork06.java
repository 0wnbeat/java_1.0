/*
Задача №6_ Операторы
        Напишите программу конвертер физических величин:

        1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
        > Выберите что переводить: 1 - масса, 2 - расстояние
        > 2

        2. Пользователю предлагается выбрать единицу измерения. Пример:
        > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
        > 1

        3. Пользователю предлагается ввести количество выбранных единиц:
        > Введите число
        > 10
        > Результат:
        > Метры: 10
        > Мили: 0.006
        > Ярды: 10.94
        > Футы: 32.81
*/

import java.util.Scanner;

public class TaskWork06 {
    public static void main(String[] args) {
        double[] weightRatio = {1, 0.0610475, 2.20462};
        double[] distanceRatio = {1, 0.000621371, 1.09361, 3.28084};

        String weightResultTemplate = "Результат:\n" +
                "килограмм: %2f\n" +
                "пуд: %2f\n" +
                "фунт: %2f";
        String distanceResultTemplate = "Результат:\n" +
                "метр: %2f\n" +
                "миля: %2f\n" +
                "ярд: %2f\n" +
                "фут: %2f";

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner scanner = new Scanner(System.in);
        int choiceLvl1 = scanner.nextInt();

        switch (choiceLvl1) {
            case 1:
                System.out.println("Выберите что переводить: 1 - килограмм, 2 - пуд, 3 - фунт");
                int weightChoice = scanner.nextInt();
                switch (weightChoice) {
                    case 1:
                        System.out.println("Введите количество");
                        double quantity1 = scanner.nextInt();
                        System.out.printf(
                                weightResultTemplate,
                                quantity1 * weightRatio[0] / weightRatio[0],
                                quantity1 * weightRatio[1] / weightRatio[0],
                                quantity1 * weightRatio[2] / weightRatio[0]
                        );
                        break;
                    case 2:
                        System.out.println("Введите количество");
                        double quantity2 = scanner.nextInt();
                        System.out.printf(
                                weightResultTemplate,
                                quantity2 * weightRatio[0] / weightRatio[1],
                                quantity2 * weightRatio[1] / weightRatio[1],
                                quantity2 * weightRatio[2] / weightRatio[1]
                        );
                        break;
                    case 3:
                        System.out.println("Введите количество");
                        double quantity3 = scanner.nextInt();
                        System.out.printf(
                                weightResultTemplate,
                                quantity3 * weightRatio[0] / weightRatio[2],
                                quantity3 * weightRatio[1] / weightRatio[2],
                                quantity3 * weightRatio[2] / weightRatio[2]
                        );
                        break;
                    default:
                        break;
                } break;

            case 2:
                System.out.println("Выберите что переводить: 1 - метр, 2 - миля, 3- ярд, 4 - фут");
                int distanceChoice = scanner.nextInt();
                switch (distanceChoice) {
                    case 1:
                        System.out.println("Введите количество");
                        double quantity1 = scanner.nextInt();
                        System.out.printf(
                                distanceResultTemplate,
                                quantity1 * distanceRatio[0] / distanceRatio[0],
                                quantity1 * distanceRatio[1] / distanceRatio[0],
                                quantity1 * distanceRatio[2] / distanceRatio[0],
                                quantity1 * distanceRatio[3] / distanceRatio[0]
                        );
                        break;
                    case 2:
                        System.out.println("Введите количество");
                        double quantity2 = scanner.nextInt();
                        System.out.printf(
                                distanceResultTemplate,
                                quantity2 * distanceRatio[0] / distanceRatio[1],
                                quantity2 * distanceRatio[1] / distanceRatio[1],
                                quantity2 * distanceRatio[2] / distanceRatio[1],
                                quantity2 * distanceRatio[3] / distanceRatio[1]
                        );
                        break;
                    case 3:
                        System.out.println("Введите количество");
                        double quantity3 = scanner.nextInt();
                        System.out.printf(
                                distanceResultTemplate,
                                quantity3 * distanceRatio[0] / distanceRatio[2],
                                quantity3 * distanceRatio[1] / distanceRatio[2],
                                quantity3 * distanceRatio[2] / distanceRatio[2],
                                quantity3 * distanceRatio[3] / distanceRatio[2]
                        );
                        break;
                    case 4:
                        System.out.println("Введите количество");
                        double quantity4 = scanner.nextInt();
                        System.out.printf(
                                distanceResultTemplate,
                                quantity4 * distanceRatio[0] / distanceRatio[3],
                                quantity4 * distanceRatio[1] / distanceRatio[3],
                                quantity4 * distanceRatio[2] / distanceRatio[3],
                                quantity4 * distanceRatio[3] / distanceRatio[3]
                        );
                        break;
                    default:
                        break;
                } break;
            default:
                break;
        }
    }
}