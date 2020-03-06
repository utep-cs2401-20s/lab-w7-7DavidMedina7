public class SortOfSort {

  public static void sortOfSort(int[] array) {

    // Printing out the array
    printArray(array);

    // Counter to keep track of times swapped
    int count = 0;

    // Index to keep track of the first element in the array
    int first = 0;

    // Index to keep track of the last element in the array
    int last = array.length - 1;

    // Variable to store the max element
    int maxNum;

    // Variable to keep track of the index of where max was found
    int maxFoundAt = 0;

    // Initialize temp to be 0
    int temp = 0;

    while(first < last) {
      maxNum = array[first];
      for(int i = first; i <= last; i++) {
        System.out.println("i: " + i);
        System.out.println("first: " + first);
        // Finding the max element in the array
        if(array[i] >= array[maxFoundAt]) {
          maxNum = array[i];
          maxFoundAt = i;
          System.out.println("maxNum is: " + maxNum);
          System.out.println("maxFoundAt is: " + maxFoundAt);
        }
      }

      // Reset count
      if(count == 4) {
        count = 0;
      }

      // If count is equal to 2...
      if(count < 2) {

        // Swap the elements
        temp = array[last];
        System.out.println("temp[back] is: " + temp);

        array[last] = maxNum;
        System.out.println("array[last] is: " + array[last]);

        array[maxFoundAt] = temp;
        System.out.println("array[maxFoundAt] (back) is: " + array[maxFoundAt]);

        // Decrement the rightmost boundary
        last--;

        // Increment the count
        count++;

        // Print array
        printArray(array);

      }else{

        // Swap the elements
        temp = array[first];
        System.out.println("temp[first] is: " + temp);

        array[first] = maxNum;
        System.out.println("array[first] is: " + array[first]);

        array[maxFoundAt] = temp;
        System.out.println("array[maxFoundAt] (front) is: " + array[maxFoundAt]);

        // Decrement the leftmost boundary
        first++;

        // Increment the count
        count++;

        // Print array
        printArray(array);

      }
    }

    // Print array
    printArray(array);
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
