package DSA;
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public class MaxWealth {
    public static void main(String[] args) {
        
    }
    public int maximumWealth(int[][] accounts) {
       //person = row
       //account = col
       int ans = Integer.MIN_VALUE;
       for(int person =0; person < accounts.length; person++){
        //when you start a new col, take a new sum for that row
        int sum = 0;
        for(int account = 0; account < accounts[person].length; account++) {
              sum += accounts[person][account];
        }
        // now we have sum of accounts of person
        //check with overall ans
        if(sum>ans){
            ans = sum;
        }
       }
       return ans;
    }
    
    
}
