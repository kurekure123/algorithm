package com.bit.loop;

/*
Algorithm 11번째 문제
1-2+3-4+5-6...+99-100의 합계
 * */

public class ArithmeticSquence11 {
	public static void main(String[] args) {
		String str = "";
		int res = 0, odd = 0, even = 0; 
		for(int i = 1; i <= 100; i ++) {
			if(i % 2 == 0) {
				if(i == 100) {
					str +=i + "=";
				}else {
					str +=i + "+";
				} even -= i;
			}else {
			str += i + "-";
			odd += i;
			}
		}
		System.out.print(str + (odd+even));
	}
}
