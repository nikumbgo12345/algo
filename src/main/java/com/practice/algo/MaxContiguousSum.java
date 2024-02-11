package com.practice.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


/**
 * A class that calculates the maximum contiguous sum of an array of integers.
 * It uses the Kadane's algorithm to find the maximum sum.
 */
@SpringBootApplication
public class MaxContiguousSum {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

   /* public static List<Integer> maxSubarray(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int[] value =  arr.stream().mapToInt(a-> a).toArray();
        if (value == null || value.length == 0) {
            return result;
        }
        int sum = value[0];
        int maxSum = value[0];
        int allPos = value[0];

        for (int i = 1; i < value.length; i++) {


            sum = Math.max(value[i], sum + value[i]);

            allPos = Math.max(value[i]+allPos, allPos);
            if(value[i] > allPos)
                allPos = value[i];
            maxSum = Math.max(sum, maxSum);
        }
        result.add( Math.max(sum, maxSum));
        result.add(allPos);
        return result;
    }

}
*/
    public static int maxContiguousSum(int[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        int sum = value[0];
        int maxSum = value[0];
        int allPos = value[0];
// 2 3 5 -10 11
        for (int i = 1; i < value.length; i++) {


            sum = Math.max(value[i], sum + value[i]);

            allPos = Math.max(value[i]+allPos, allPos);
            maxSum = Math.max(sum, maxSum);
        }
        return Math.max(sum, maxSum);

    }

    public static void main(String[] args) {
        SpringApplication.run(MaxContiguousSum.class, args);

        int[] values = new int[]{1, 2, -5, 8,10,-100,6};
        int result = maxContiguousSum(values);
        System.out.println("The result is " + result);
    }

}