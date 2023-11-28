import java.util.Scanner;//Scanner class
public class Binary_search {
     //222-35-1183
     static int Binary(int[] array, int key) {
          int left, right, mid;
          left = 0;
          right = array.length - 1;
          while (left <= right) {
               mid = (left + right) / 2;//Finding mid position
               if (array[mid] == key) {//Checking if key equal to mid
                    System.out.println("The key is found at index " + mid + " and the key is " + array[mid]);
                    return 0;
               } else if (array[mid] < key) {//Checking if key is bigger than mid
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }
          System.out.println("The key is not found");
          return -1;
     }

     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int[] array = new int[6];
          System.out.println("The array: ");
          for(int i=0; i<array.length; i++) {//for input
               array[i] = sc.nextInt();
          }
          System.out.println("The key:");
          int key = sc.nextInt();//finding element
          Binary(array, key);//taking array and finding element
          sc.close();
     }
}
