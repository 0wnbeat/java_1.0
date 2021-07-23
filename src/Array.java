public class Array {
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
