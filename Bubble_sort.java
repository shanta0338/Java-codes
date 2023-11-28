public class  Bubble_sort {

     public static void Sort(int[] array) {
          // To improve
          for(int i = 0; i < array.length - 1; i++) {
               boolean flag = false;
               for(int j = 0; j < array.length - 1 - i; j++) {
                    if(array[j] > array[j + 1]) {
                         int temp = array[j];
                         array[j] = array[j + 1];
                         array[j + 1] = temp;
                         flag = true;
                    }
               }
               if(flag != true) {
                    break;
               }
          }
     }

     public static void main(String [] args) {
          int [] array = {7,8,1,2,3};
          Sort(array);
          System.out.println("Sorted Array:");
          for(int i: array) {
               System.out.print(i+" ");
          }
          System.out.println();
     }
}