package net.inkihong.sort;

public class CocktailShakerSort {

    public int[] sort(int[] arr) throws Exception {
        int len = arr.length;

        if (len > 1) {
            boolean isSwapped;
            do {
                isSwapped = false;
                    for (int i = 0; i < len-2; i++) {
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

                    for (int i = len-2; i >= 0; i--) {
                        if (arr[i] > arr[i+1]) {
                            arr[i] = arr[i] ^ arr[i+1];
                            arr[i+1] = arr[i] ^ arr[i+1];
                            arr[i] = arr[i] ^ arr[i+1];
                            isSwapped = true;
                        }
                    }
            } while (isSwapped); 
        } else if (len == 1) {
            // do nothing
        } else {
            throw new Exception("cannot sort an empty array");
        }
        
        return arr;
    }
}