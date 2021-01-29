package net.inkihong.sort;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class ShellSortTest {

    @Test
    public void testSort() {
        ShellSort shellSort = new ShellSort();
        
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 500);
        }

        System.out.println("[ShellSort] my array before sorting: ");
        System.out.println(Arrays.toString(myArray));

        myArray = shellSort.sort(myArray);

        System.out.println("[ShellSort] my array after sorting: ");
        System.out.println(Arrays.toString(myArray));

        boolean isSorted = false;

        for (int i = 0; i < myArray.length-1; i++) {
            isSorted = myArray[i] < myArray[i+1];
        }

        assertEquals(true, isSorted);
    }
}