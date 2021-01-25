import java.util.Arrays;

public class InsertionSort {

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
        for (int i = 1; i < arr.length-1; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                arr[j-1] = arr[j-1] ^ arr[j];
                arr[j] = arr[j-1] ^ arr[j];
                arr[j-1] = arr[j-1] ^ arr[j];
                j--;
            }
        }
        
        return arr;
    }
}