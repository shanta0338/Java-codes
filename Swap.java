import java.util.Scanner;
import java.util.ArrayList;

public class Swap {

     static Scanner sc = new Scanner(System.in);

     public static void swap(ArrayList<Integer> array) {
          System.out.println("Give 1st and 2nd index to swap:");
          int Firstindx = sc.nextInt();
          int SecondIndex = sc.nextInt();
          int temp = array.get(Firstindx);
          array.set(Firstindx, array.get(SecondIndex));
          array.set(SecondIndex, temp);
     }

     public static void main(String args[]) {
          ArrayList<Integer> array = new ArrayList<>();
          int number;
          System.out.println("Enter  5 values:");
          for(int i = 0; i < 5; i++) {

               number = sc.nextInt();
               array.add(number);
          }

          swap(array);
          System.out.println("After swap:");
          for(int i: array) {
               System.out.print(i+" ");
          }
     }
}