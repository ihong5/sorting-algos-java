package net.inkihong.sort;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class CocktailShakerSortTest {

    @Test
    public void testSort() {
        CocktailShakerSort cocktailShakerSort = new CocktailShakerSort();
        
        int[] myArray = new int[10];

        boolean isSorted = false;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 500);
        }

        try {
            System.out.println("[CocktailShakerSort] my array before sorting: ");
            System.out.println(Arrays.toString(myArray));

            myArray = cocktailShakerSort.sort(myArray);

            System.out.println("[CocktailShakerSort] my array after sorting: ");
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