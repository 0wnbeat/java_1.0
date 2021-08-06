/*
Задача №5_ Операторы
        Напишите простой калькулятор:

        Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */

import java.util.Scanner;

public class TaskWork05 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа, а затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’:");
        Scanner scanner = new Scanner(System.in);
        String s_x = scanner.nextLine();
        String s_y = scanner.nextLine();
        String symbol = scanner.nextLine();

        double x = new Integer(s_x);
        double y = new Integer(s_y);

        switch (symbol) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Введен не корректный оператор!");
                break;
        }
    }
}
