public class Insertion_Sort {

     public static void Sort(int[] array) {
          for(int i = 1; i < array.length; i++) {
               int Pivot = array[i];
               int j = i-1;
               while(j >= 0 && Pivot < array[j]) {
                    array[j + 1] = array[j];
                    j--;
               }
               array[j + 1] = Pivot;
          }
     }
     public static void main(String args[]) {
          int [] array = {7,8,1,3,2};
          Sort(array);
          System.out.println("Sorted Array:");
          for(int i: array) {
               System.out.print(i+" ");
          }
          System.out.println();
     }
}