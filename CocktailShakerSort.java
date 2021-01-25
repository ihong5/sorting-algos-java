import java.util.Arrays;

public class CocktailShakerSort {

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
        boolean isSwapped;
        do {
            isSwapped = false;
            for (int i = 0; i < arr.length-2; i++) {
                if (arr[i] > arr[i+1]) {
                    arr[i] = arr[i] ^ arr[i+1];
                    arr[i+1] = arr[i] ^ arr[i+1];
                    arr[i] = arr[i] ^ arr[i+1];
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }

            for (int i = arr.length-2; i >= 0; i--) {
                if (arr[i] > arr[i+1]) {
                    arr[i] = arr[i] ^ arr[i+1];
                    arr[i+1] = arr[i] ^ arr[i+1];
                    arr[i] = arr[i] ^ arr[i+1];
                    isSwapped = true;
                }
            }
        } while (isSwapped); 
        
        return arr;
    }
}