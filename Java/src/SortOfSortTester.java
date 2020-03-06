import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {
    // Case #1: Nothing special and is even numbered array
    public int[] array1 = {1, 6, 3, 5, 8, 2, 4, 7};

    // Case #2: Odd numbered array
    public int[] array2 = {7, 8, 3};

    // Case #3: Duplicate in array and is even numbered array
    public int[] array3 = {7, 5, 4, 3, 2, 7};

    // Case #4: Duplicate in array and is odd numbered array
    public int[] array4 = {1, 5, 3, 5, 2};

    // Case #5: Only single element in the array
    public int[] array5 = {5};

    @Test
    // TESTING ARRAY #1:
    // * Starting array: {1, 6, 3, 5, 8, 2, 4, 7}
    // * Expecting array: {6, 5, 2, 1, 3, 4, 7, 8}
    // TEST: PASSED
    // (array reference at the top)
    // TEST DESCRIPTION: Nothing special and is even numbered array
    public void Test1() {
        int[] result = {6, 5, 2, 1, 3, 4, 7, 8};
        SortOfSort.sortOfSort(array1);
        assertArrayEquals(result, array1);
    }

    @Test
    // TESTING ARRAY #2:
    // * Starting array: {7, 8, 3}
    // * Expecting array: {3, 7, 8}
    // TEST: PASSED
    // (array reference at the top)
    // TEST DESCRIPTION: Nothing special and is odd numbered array
    public void Test2() {
        int[] result = {3, 7, 8};
        SortOfSort.sortOfSort(array2);
        assertArrayEquals(result, array2);
    }

    @Test
    // TESTING ARRAY #3:
    // * Starting array: {7, 5, 4, 3, 2, 7}
    // * Expecting array: {5, 4, 2, 3, 7, 7}
    // TEST: PASSED
    // (array reference at the top)
    // TEST DESCRIPTION: Duplicate in array and is even numbered array
    public void Test3() {
        int[] result = {5, 4, 2, 3, 7, 7};
        SortOfSort.sortOfSort(array3);
        assertArrayEquals(result, array3);
    }

    @Test
    // TESTING ARRAY #4:
    // * Starting array: {1, 5, 3, 5, 2}
    // * Expecting array: {3, 2, 1, 5, 5}
    // TEST: PASSED
    // (array reference at the top)
    // TEST DESCRIPTION: Duplicate in array and is odd numbered array
    public void Test4() {
        int[] result = {3, 2, 1, 5, 5};
        SortOfSort.sortOfSort(array4);
        assertArrayEquals(result, array4);
    }

    @Test
    // TESTING ARRAY #5:
    // * Starting array: {5}
    // * Expecting array: {5}
    // TEST: PASSED
    // (array reference at the top)
    // TEST DESCRIPTION: Only single element in the array
    public void Test5() {
        int[] result = {5};
        SortOfSort.sortOfSort(array5);
        assertArrayEquals(result, array5);
    }
}