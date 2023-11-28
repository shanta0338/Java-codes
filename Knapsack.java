public class Knapsack {
    public static void main(String[] args) {
        int[] profit = {100, 110, 120, 160};
        int[] weight = {10, 5, 8, 3};
        int capacity = 18;
        int n = profit.length;
        int[][] dp = new int[n+1][capacity+1];

        //This loop for row or just say profit
        for(int i=0; i<=n; i++) {

            //This loop for column or say weight
            for(int j=0; j<= capacity; j++) {

                if(i==0 || j==0) {
                    dp[i][j] = 0;
                } else if(weight[i-1]<=j) {
                    //This statement this backtracking it's previous index
                    dp[i][j] = Math.max(dp[i-1][j-weight[i-1]]+profit[i-1], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println("Total profit: "+dp[n][capacity]);
    }
}