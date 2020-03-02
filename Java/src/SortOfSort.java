public class SortOfSort {
  public static void main(String[] args) {

    // Case #1: Nothing special and is even numbered array
    int[] array1 = {1, 6, 3, 5, 8, 2, 4, 7};

    // Case #2: Odd numbered array
    int[] array2 = {1, 6, 3, 5, 8};

    // Case #3: Duplicate in array and is even numbered array
    int[] array3 = {2, 5, 4, 3, 2, 7};

    // Case #4: Duplicate in array and is odd numbered array
    int[] array4 = {1, 5, 3, 5, 2};

    // Case #5: Only single element in the array
    int[] array5 = {5};

    sortOfMirror(array1);
  }

    public static void sortOfMirror(int[] array) {

        int maxNum = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);
    }
  }
