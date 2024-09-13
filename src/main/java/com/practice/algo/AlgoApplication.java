package com.practice.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

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
				int lmin = calculaemininleft(value);
				int rmax = calculatemaxeight(value);
				return Math.max(Math.max(m1, m2), rmax-lmin);

		}

    public static void main(String[] args) {
        SpringApplication.run(AlgoApplication.class, args);

        int[] values = new int[] {-90,0,2,3,4,100,8};
        int result = maxSubArray(values,0, values.length-1);
        System.out.println("The result is " + result);
    }

	static int calculatemaxeight(int[] values)
	{
		return Arrays.stream(values).max().getAsInt();

	}

	static int calculaemininleft(int[] values)
	{
		return Arrays.stream(values).min().getAsInt();
	}
}