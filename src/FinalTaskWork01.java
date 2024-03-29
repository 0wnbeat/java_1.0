/*
Итоговая задача №1
        Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        Пользователь вводит текущий курс и количество рублей.
        Итоговое значение должно быть округлено до двух знаков после запятой.

        Пример для теста работы программы:
        Курс доллара: 67,55
        Количество рублей: 1000
        Итого: 14,80 долларов
*/
import java.util.Scanner;

public class FinalTaskWork01 {
    public static void main(String[] args) {
        System.out.println("Курс доллара: ");
        Scanner rate = new Scanner(System.in);
        Double rateDollar = rate.nextDouble();

        System.out.println("Количество рублей: ");
        Scanner count = new Scanner(System.in);
        Double countRub = count.nextDouble();

        double result;
        result = countRub / rateDollar;
        String resultStr = String.format("%.2f", result);
        System.out.println("Итого: " + resultStr + " долларов");
    }
}
