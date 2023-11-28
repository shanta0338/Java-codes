import java.util.Scanner;

class Switch {

     static double Sum(double number, double number2) {
          return number + number2;
     }

     static double Sub(double number, double number2) {
          return number - number2;
     }

     static double Mul(double number, double number2) {
          return number * number2;
     }

     static double Div(double number, double number2) {
          return number / number2;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the numbers:");
          double number = sc.nextDouble();
          double number2 = sc.nextDouble();
          System.out.println("1. Sum.\n2. Sub.\n3. Mul.\n4. Div.");
          int n = sc.nextInt();
          switch (n) {
               case 1:
                    System.out.println(Sum(number, number2));
                    break;
               case 2:
                    System.out.println(Sub(number, number2));
                    break;
               case 3:
                    System.out.println(Mul(number, number2));
                    break;
               case 4:
                    System.out.println(Div(number, number2));
                    break;
               default:
                    System.out.println("Nothing");
                    break;
          }
          sc.close();
     }
}