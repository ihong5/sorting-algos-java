package net.inkihong.sort;

public class InsertionSort {

    public int[] sort(int[] arr) throws Exception {
        int len = arr.length;

        if (len > 1) {
            for (int i = 1; i < arr.length; i++) {
                int j = i;
                while (j > 0 && arr[j-1] > arr[j]) {
                    arr[j-1] = arr[j-1] ^ arr[j];
                    arr[j] = arr[j-1] ^ arr[j];
                    arr[j-1] = arr[j-1] ^ arr[j];
                    j--;
                }
            }
        } else if (len == 1) {
            // do nothing
        } else {
            throw new Exception("cannot sort an empty array");
        }
        
        return arr;
    }
}