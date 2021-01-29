package net.inkihong.sort;

public class ShellSort {

    public int[] sort(int[] arr) {
        int size = arr.length,
            gap = size / 2;

        for (int i = gap; i > 0; i /= 2) {
            for (int j = i; j < size; j++) {
                int temp = arr[j];
                int k;
                for (k = j; k >= i && arr[k-i] > temp; k -= i) {
                    arr[k] = arr[k-i];
                }
                arr[k] = temp;
            }
        }
        return arr;
    }
}
