import java.util.Scanner;//Scanner class
public class Re_Knapsack {
    public static void main(String[] args) {
        //222-35-1183
        Scanner sc = new Scanner(System.in);
        int[] profit = new int[4];
        int[] weight = new int[4];
        System.out.println("Taking profit: ");//Taking profit
        for(int i=0; i<profit.length; i++) {
            profit[i] = sc.nextInt();
        }
        System.out.println("Taking weight:");//taking weight
        for(int j=0; j<weight.length; j++) {
            weight[j] = sc.nextInt();
        }
        System.out.println("Capasity: ");//taking capasity
        int capacity = sc.nextInt();
        int n = profit.length;//taking profit length
        System.out.println("Total profit: "+Profit(profit, weight, capacity, n));
        sc.close();
    }

    public static int Profit(int[] profit, int[] weight, int capacity, int n) {
        if(n==0 || capacity ==0) {//if n is zero and capasity than it will return zero
            return 0;
        } else if(weight[n-1] > capacity) {//Checking weight is bigger than capasity
            return Profit(profit,weight,capacity, n-1);//it is true it will not include profit
        } else {//Checking weight is smaller than capasity
            int include = profit[n-1] + Profit(profit,weight,capacity - weight[n-1],n-1);//it adding profit
            int exclude = Profit(profit,weight,capacity,n-1);//it adding previous profit
            return Math.max(include, exclude);// it will return maxmum profit
        }
    }
}
