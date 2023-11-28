import java.util.*;
public class Syntax {
    public static void main(String [] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(90);
        array.add(12);
        array.add(76);
        array.add(23);
        Collections.sort(array);
        for(int i=0; i<array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("Total result = "+Sum(array));
    }
    public static int Sum(ArrayList<Integer> array) {
        int sum = 0;
        for(int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }
}