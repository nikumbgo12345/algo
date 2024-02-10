package com.practice.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgoApplication {


		public static int maxSubArray(int[] value, int l, int u) {
			if (u == l) {
				return 0;
			} else if (u == l + 1) {
				return Math.max(value[u] - value[l], 0);
			}
				int mid = (u + l) / 2;
				int m1 = maxSubArray(value, l, mid);
				int m2 = maxSubArray(value, mid + 1, u);
				return Math.max(m1, m2);

		}

    public static void main(String[] args) {
        SpringApplication.run(AlgoApplication.class, args);

        int[] values = new int[] {110,2,3,4,100,8};
        int result = maxSubArray(values,0, values.length-1);
        System.out.println("The result is " + result);
    }

}