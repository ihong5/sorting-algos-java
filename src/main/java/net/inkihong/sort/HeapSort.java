package net.inkihong.sort;

public class HeapSort {

    public int[] sort(int[] arr) throws Exception {
        int n = arr.length;

        if (n > 1) {
            for (int i = ((n/2)-1); i >= 0; i--) {
                heapify(arr, n, i);
            }
    
            for (int i = n-1; i > 0; i--) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
    
                heapify(arr, i, 0);
            }
        } else if (n == 1) {
            // do nothing
        } else {
            throw new Exception("cannot sort an empty array");
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
