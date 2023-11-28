import java.util.Scanner;
public class Matrix {
     public static void main(String args []) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Enter the number of rows:");
          int rows = sc.nextInt();
          System.out.println("Enter the number of colums:");
          int cols = sc.nextInt();
          int [] [] arr = new int [rows][cols];
          int [] [] trans = new int [rows] [cols];
          for(int i = 0; i < rows; i++) {
               for(int j = 0; j < cols ; j++) {
                    arr [i] [j] = sc.nextInt();
               }
          }

          for(int i = 0; i < rows; i++) {
               for(int j = 0; j < cols ; j++) {
                   trans [i] [j] = arr [j] [i];
               }
          }

          for(int i = 0; i < rows; i++) {
               for(int j = 0; j < cols ; j++) {
                    System.out.println(trans[i][j]);
               }
          }
               sc.close();
     }
}
