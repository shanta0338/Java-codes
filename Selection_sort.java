public class Selection_sort {

     public static void Sort(int[] array) {
          for (int i = 0; i < array.length - 1; i++) {
               int small = i;
               for (int j = i + 1; j < array.length; j++) {
                    if (array[small] > array[j]) {
                         small = j;
                    }
               }
               int temp = array[small];
               array[small] = array[i];
               array[i] = temp;
          }
     }

     public static void main(String[] args) {
          int[] array = { 8, 7, 5, 43, 2 };
          Sort(array);
          System.out.println("Sorted Array:");
          for (int i : array) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
}