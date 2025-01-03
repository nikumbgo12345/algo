/**
You are given an array of integers cost where cost[i] is the cost of taking a step from the ith floor of a staircase. After paying the cost, you can step to either the (i + 1)th floor or the (i + 2)th floor.

You may choose to start at the index 0 or the index 1 floor.

Return the minimum cost to reach the top of the staircase, i.e. just past the last index in cost.

Example 1:

Input: cost = [1,2,3]
*/


class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
            int n = cost.length;
         //   int[] counter = new int[n];
int prev1 ,prev2, temp =0;
            if(n < 2)
            return cost[0];
            else if (n == 2)
             return Math.min(cost[0],cost[1]);
             else{
                prev1 = cost[0];
                prev2 = cost[1];
                for(int i=2; i< n; i++){
                    temp = Math.min(prev2, prev1) +cost[i];                    
                    prev1 = prev2;
                    prev2 = temp;
                }
                return Math.min(prev1, prev2);
             }

    }
}
