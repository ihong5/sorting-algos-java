package net.inkihong.sort;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort bubble = new BubbleSort();

        int[] myArray = new int[10];

        boolean isSorted = false;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 500);
        }

        try {
            System.out.println("[BubbleSort] my array before sorting: ");
            System.out.println(Arrays.toString(myArray));

            myArray = bubble.sort(myArray);

            System.out.println("[BubbleSort] my array after sorting: ");
            System.out.println(Arrays.toString(myArray));

            for (int i = 0; i < myArray.length-1; i++) {
                isSorted = myArray[i] <= myArray[i+1];
            }
        } catch (Exception ex) {
            assertEquals(false, isSorted);
        }

        assertEquals(true, isSorted);
    }

    @Test
    public void testReverseSort() {
        BubbleSort bubble = new BubbleSort();

        int[] myArray = new int[10];

        boolean isSorted = false;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 500);
        }

        try {
            System.out.println("[BubbleSort] my array before sorting: ");
            System.out.println(Arrays.toString(myArray));

            myArray = bubble.sort(myArray);

            System.out.println("[BubbleSort] my array after sorting: ");
            System.out.println(Arrays.toString(myArray));

            for (int i = myArray.length-1; i > 0; i--) {
                isSorted = myArray[i] >= myArray[i-1];
            }

            assertEquals(true, isSorted);
        } catch (Exception ex) {
            assertEquals(false, isSorted);
        }
    }

    @Test
    public void testEmptySort() {
        BubbleSort bubble = new BubbleSort();

        int[] myArray = new int[] { };

        boolean isSorted = false;

        try {
            System.out.println("[BubbleSort] my array before sorting: ");
            System.out.println(Arrays.toString(myArray));

            myArray = bubble.sort(myArray);

            System.out.println("[BubbleSort] my array after sorting: ");
            System.out.println(Arrays.toString(myArray));

            for (int i = 0; i < myArray.length-1; i++) {
                isSorted = myArray[i] <= myArray[i+1];
            }

            assertEquals(true, isSorted);
        } catch (Exception ex) {
            assertEquals(false, isSorted);
        }
    }
}