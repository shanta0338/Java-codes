public class coinChangeways {
    public static void main(String[] args) {
        int[] coins = {2,3,5};
        int weight = 9;
        int n = coins.length;
        int[][] array = new int[n+1][weight+1];

        //mainPart
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=weight; j++) {
                if(j==0) {
                    array[i][j] = 1;
                } else if(coins[i-1] > j) {
                    array[i][j] = array[i-1][j];
                }else {
                    array[i][j] = array[i-1][j] + array[i][j-coins[i-1]];
                }
            }
        }
        System.out.println("Number of ways: "+array[n][weight]);
    }
}