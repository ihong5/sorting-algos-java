package net.inkihong.sort;

public class SelectionSort {

    public int[] sort(int[] arr) {
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