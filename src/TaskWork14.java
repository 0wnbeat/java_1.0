/*
Задача №14_ Работа с данными
        Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
        Выведите максимальный и минимальный элемент массива.
        Из максимального и минимального значения выведите наибольшее по модулю.
*/


public class TaskWork14 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        int max = -21;
        int min = 21;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random() * 41) - 20;
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        int maxAbs; //Ввожу дополнительную переменную, чтобы сохранить значения max и min
        if (Math.abs(max) < Math.abs(min)) {
            maxAbs = min;
        } else maxAbs = max;
        System.out.println("Наибольший по модулю элемент массива: " + Math.abs(maxAbs));
    }
}
