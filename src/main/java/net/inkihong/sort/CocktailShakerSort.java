package net.inkihong.sort;

public class CocktailShakerSort {

    public int[] sort(int[] arr) {
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