public class QuickSort {
     static int pertition(int [] array, int start, int end) {

          int pivot = array[end];
          int i = start - 1;

          for(int j = start; j < end; j++) {
               if(array[j] < pivot) {
                    i++;
                    int temp = array[i]; 
                    array[i] = array[j];
                    array[j] = temp;
               }
          }
          
          i++;
          int k = array[i];
          array[i] = pivot;
          array[end] = k;
          return i;
     }

     static void quickSort(int[] array, int start, int end) {

          if(start < end) {
               int pivot = pertition(array, start, end);
               quickSort(array, start, pivot-1);
               quickSort(array, pivot+1, end);
          }
     }
     
     static void Display(int[] array) {
          for(int i: array) {
               System.out.print(i+" ");
          }
          System.out.println();
     }
     public static void main(String [] args) {
          int [] array = {23,98,678,1,-1,0};
          System.out.println("Array before sort:");
          Display(array);
          quickSort(array, 0, array.length-1);
          System.out.println("After Sort:");
          Display(array);
     }
}