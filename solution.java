// richest customer wealth 

class solution{
    public static void main(String[] args) {
        int[][] accounts = {
                        {1,2,3},
                        {3,6,2},
                        {1,23,7}
                            };
        System.out.println(max(accounts));                    
    }

    static int problem(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person<accounts.length; person++){
            // when you start a new column , take a new for that row
            int sum = 0;
            for(int account = 0; account<accounts[person].length; account++){
               sum += accounts[person][account];      
            }
            //now we have sum of accounts
            // check with overall ans
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

    static int max(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                    sum = sum + accounts[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}