package com.bit.loop;
// 1 ~ 100까지 홀수의 합
// modular = % 
// 1 % 2 = 1
// 2 % 2 = 0
// 3 % 2 = 1
public class OddSum {
  public static void main(String[] args) {
	  String t = "";
	  int t2 = 0, res = 0; 
	  for(int i = 1; i <= 99; i++) {
		  if( i % 2  == 1 ) {
			  if(i != 99) {
				  t += i + "+";
			  }else {
				  t += i + "=";
			  }
			  res += i;
		  }else { 

		  }
	  }
	  System.out.println(t + res);
  }
}
