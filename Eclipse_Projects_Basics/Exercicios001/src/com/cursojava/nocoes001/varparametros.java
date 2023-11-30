package com.cursojava.nocoes001;

public class varparametros {
	public float media(int x1, int x2, int x3) {
		return (x1+x2+x3)/3;
	}
	
	public float media(int...nums) {
		int sum = 0;
		if(nums.length>0) {
			for(int x:nums) {
				sum += x;
			}
		}
		return sum/nums.length;
	}
}
