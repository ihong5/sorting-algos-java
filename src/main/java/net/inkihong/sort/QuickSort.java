package net.inkihong.sort;

public class QuickSort {

    public int[] sort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            arr = sort(arr, left, index - 1);
        }
        
        if (index < right) {
            arr = sort(arr, index, right);
        }

        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int i = left, 
            j = right, 
            pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return i;
    }
}