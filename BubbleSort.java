import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 500);
        }

        System.out.println("my array before sorting: ");
        System.out.println(Arrays.toString(myArray));

        myArray = sort(myArray);

        System.out.println("my array after sorting: ");
        System.out.println(Arrays.toString(myArray));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }

        return arr;
    }
}