package com.bit.loop;
/*
 Algorithm 10번 문제 
 1+2+3+4+....+100의 합계
 *  */
public class ArithmeticSquence10 {
    public static void main(String[] args) {
    	String[] arr = {
    	};
    	String t = "";
    	int res = 0;
    	for(int i = 1; i <= 100; i++) {
    		res += i;
    		if(i != 100) {
    			t += i + "+";	
    		}else {
    			t += i + "=";
    		}
    	}
    	System.out.println(t + res);
    }
}
	// 1 + 2 + .. + 10
   

