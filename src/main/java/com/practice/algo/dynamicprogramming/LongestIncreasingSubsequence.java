package com.practice.algo.dynamicprogramming;


import java.util.Arrays;

/*Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1


Constraints:

        1 <= nums.length <= 2500
        -104 <= nums[i] <= 104*/
public class LongestIncreasingSubsequence {
    /**
     * write shortcuts fpr intellijmacos i will need to write codem like formattina commenting generating methods and others
     */
    /**
     * Commenting shortcut for IntelliJ on macOS: Command + /
     * <p>
     * Formatting shortcut for IntelliJ on macOS: Option + Command + L
     * <p>
     * Generating methods shortcut for IntelliJ on macOS: Command + N
     */

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,2,3};

        int[] lcs = new int[nums.length];
        Arrays.fill(lcs,1);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)

            {
                if(nums[j]< nums[i])
                {
                    lcs[i] = Math.max(lcs[j]+1,lcs[i]);
                }
            }
        }
Arrays.stream(lcs).forEach(a-> System.out.println(a));
        System.out.println(Arrays.stream(lcs).max().getAsInt());

    }
}
