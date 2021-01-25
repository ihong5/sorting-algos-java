import java.util.Arrays;

public class SelectionSort {

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
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                arr[i] = arr[i] ^ arr[min];
                arr[min] = arr[i] ^ arr[min];
                arr[i] = arr[i] ^ arr[min];
            }
        }
        
        return arr;
    }
}