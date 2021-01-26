package net.inkihong.sort;

public class MergeSort {
    
    public int[] sort(int[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }
        
        int mid = (left+right-1) / 2;

        arr = sort(arr, left, mid);
        arr = sort(arr, mid+1, right);
        merge(arr, left, mid, right);

        return arr;
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1,
            n2 = right - mid;

        int leftArr[] = new int[n1], 
            rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, 
            j = 0, 
            k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
