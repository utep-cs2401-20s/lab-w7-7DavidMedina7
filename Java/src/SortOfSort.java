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


    sortOfSort(array1);



  }

  public static void sortOfSort(int[] array) {

    // Printing out the array
    printArray(array);

    // Making the first element in the array the MAX number
    int maxNum = array[0];

    // Counter to keep track of the elements that are already sorted
    int counter = 0;

    // Int i
    int i = 0;

    for (i = 0; i < array.length - counter; i++) {
      // If the element at i is greater than the maxNum...
      if (array[i] > maxNum) {
        // Set that element as the MAX
        maxNum = array[i];
        System.out.println("maxNum is: " + maxNum);
      }
    }






  }

    // Method to print the array
    public static void printArray(int[] array) {

      System.out.print("{ ");
      for(int i = 0; i < array.length; i++) {

          System.out.print(array[i] + " ");

      }

      System.out.print("}\n");
    }

  }
