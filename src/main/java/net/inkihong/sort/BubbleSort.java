package net.inkihong.sort;

public class BubbleSort {

    public int[] sort(int[] arr) throws Exception {
        int len = arr.length;

        if (len > 1) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        arr[j] = arr[j] ^ arr[j+1];
                        arr[j+1] = arr[j] ^ arr[j+1];
                        arr[j] = arr[j] ^ arr[j+1];
                    }
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