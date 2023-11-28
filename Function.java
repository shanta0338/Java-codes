public class Function {
   
   public static void main(String[] args) {

      int[] array = {1,2,3,4,5};
      swap(array, 0, 4);
      System.out.println("After swaping:");

      for (int i : array) {

         System.out.print(i+" ");
      }

      System.out.println();
   }

   public static void swap(int[] array,int pos1, int pos2) {

      int temp = array[pos1];
      array[pos1] = array[pos2];
      array[pos2] = temp;
   }  
}