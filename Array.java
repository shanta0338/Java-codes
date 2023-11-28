public class Array {
     public static void main(String[] args) {
          String name = "I am Iron man";
          String revname="";
          
          for(int i=name.length()-1; i >=0; i--) {
               revname += name.charAt(i);
               
          }

          System.out.println(revname);
     }
}