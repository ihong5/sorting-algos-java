package net.inkihong.sort;

public class HeapSort {

    public int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = ((n/2)-1); i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        return arr;
    }

    private int[] heapify(int[] arr, int n, int rootIndex) {
        int largest = rootIndex, 
            left = (2*rootIndex)+1,
            right = (2*rootIndex)+2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != rootIndex) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }

        return arr;
    }
    
}
