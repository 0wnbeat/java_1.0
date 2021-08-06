/*
Задача №3_ Массивы
        Выполните следующие действия с массивом:

        Задайте массив из 5 любых целых чисел.
        Поменяйте местами первый и последний элемент в массиве.
        Вывести в консоль результат суммы первого и среднего элемента.
        Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
*/
public class TaskWork03 {
    public static void main(String[] args) {
        int[] myArray =  {10,20,30,40,50};

        int first = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = first;

        double averageD = Math.ceil((myArray.length-1)/2);
        int averageI = (int)averageD;

        System.out.println(myArray[0] + myArray[averageI]);
    }
}
