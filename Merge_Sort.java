import java.util.Scanner;//Scanner class
public class Merge_Sort {
     public static void main(String[] args) {
          //22-35-1183
          Scanner sc = new Scanner(System.in);
          int[] array = new int[6];
          System.out.println("The array: ");
          for(int i=0; i<array.length; i++) {//Taking input
               array[i] = sc.nextInt();
          }
          Div(array, 0, array.length-1);//Function taking array, first and last index

          System.out.println("\nPrinting Sorting elements:");
          for (int i : array) {
               System.out.print(i+" ");
          }
          System.out.println();
          sc.close();
     }

     public static void Div(int[] array, int left, int right) {//Divideing array method

          if(left < right) {//checking not left is smaller than right
               int mid = left + (right - left) / 2;//finding middle
               Div(array, left, mid);
               Div(array, mid+1, right);
               Merge(array, left, right, mid);//merging array
               for (int i : array) {
                    System.out.print(i+" ");
               }
          }
     }

     public static void Merge(int[] array, int left, int right, int mid) {

          int n1 = mid - left + 1;//getting half array size
          int n2 = right - mid;//getting other half

          //Creating left and right array
          int[]left_arr = new int[n1];
          int[]right_arr = new int[n2];

          //Coping elements
          for(int i=0; i<left_arr.length; i++) {

               left_arr[i] = array[left+i];
          }

          for(int j=0; j<right_arr.length; j++) {

               right_arr[j] = array[j+mid+1];
          }

          //Sorting
          int i=0, j=0, k= left;
          while (i < n1 && j < n2) {
               
               if(left_arr[i] <= right_arr[j]) {
                    array[k++] = left_arr[i++];//if left is small or equal to right goting to main array
               } else {
                   array[k++] = right_arr[j++];//if right is small  going to main array
               }
          }

          while(i < n1) {//if some left element in n1
               array[k++] = left_arr[i++];
          }

          while(j < n2) {//if left element in n2
               array[k++] = right_arr[j++];
          }
     }
}