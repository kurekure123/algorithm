package com.bit.opcode;

import java.util.Scanner;

class HowMuch{
     public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String[] arr = new String[9];
			arr[0] = "얼마에요?";
			arr[1] = String.format("%d 원입니다", a);
			arr[2] = "몇 개 드릴까요?";
			arr[3] = "개 주세요";
			arr[4] = "총 금액은";
			arr[5] = "비싸요, 깎아주세요";
			arr[6] = "몇 퍼센트나요?";
			arr[7] = "안남아요, 안팝니다";
			arr[8] = String.format("%d 원입니다", b)
	int a = 0, b = 0, c = 0, d = 0;
	String text = "";
	System.out.println(arr[0]);
	a = s.nextInt();
	System.out.println(a + arr[1]); 	
	System.out.println(arr[2]);	
	b = s.nextInt();
	System.out.println(b + arr[3]);
	System.out.println(arr[4] + a * b + arr[1]); 	
	System.out.println(arr[5]);
	System.out.println(arr[6]);
	c = s.nextInt();
	if(c < 10){ 
		text = (a * b) * d + arr[1];
	}else if(c >= 10) {
		text = arr[7];
	}
	System.out.printf(text);
     }
     
   
}