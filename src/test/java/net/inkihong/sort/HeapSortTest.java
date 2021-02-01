package net.inkihong.sort;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class HeapSortTest {

    @Test
    public void testSort() {
        HeapSort heapSort = new HeapSort();
        
        int[] myArray = new int[10];

        boolean isSorted = false;

        try {
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (int) (Math.random() * 500);
            }
    
            System.out.println("[HeapSort] my array before sorting: ");
            System.out.println(Arrays.toString(myArray));
    
            myArray = heapSort.sort(myArray);
    
            System.out.println("[HeapSort] my array after sorting: ");
            System.out.println(Arrays.toString(myArray));
    
            for (int i = 0; i < myArray.length-1; i++) {
                isSorted = myArray[i] <= myArray[i+1];
            }
        } catch (Exception ex) {
            assertEquals(false, isSorted);    
        }

        assertEquals(true, isSorted);
    }
}