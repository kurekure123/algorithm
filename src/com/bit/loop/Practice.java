package com.bit.loop;

/*
Algorithm 10번 문제 
1+2+3+4+....+100의 합계
*  */

public class Practice {
   public static void main(String[] args){
	   String opcode = "";
	   int res = 0;
	   for(int i = 1; i <= 100; i++) {
		   if( i % 2 == 0 ) {
			   if( i == 100) {
				   opcode += i + "=";
			   }else {
				   opcode += i + "+";
			   }
			   res += i;
		   }else {
		   }
	   }
	   System.out.print(opcode + res);
   }
}
