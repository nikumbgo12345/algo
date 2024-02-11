package com.practice.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A class that calculates the maximum contiguous sum of an array of integers.
 * It uses the Kadane's algorithm to find the maximum sum.
 */
@SpringBootApplication
public class MaxContiguousSum {


    public static int maxContiguousSum(int[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        int sum = value[0];
        int maxSum = value[0];

        for (int i = 1; i < value.length; i++) {


            sum = Math.max(value[i], sum + value[i]);


            maxSum = Math.max(sum, maxSum);
        }
        return Math.max(sum, maxSum);

    }

    public static void main(String[] args) {
        SpringApplication.run(MaxContiguousSum.class, args);

        int[] values = new int[]{1, 2, -5, 8};
        int result = maxContiguousSum(values);
        System.out.println("The result is " + result);
    }

}