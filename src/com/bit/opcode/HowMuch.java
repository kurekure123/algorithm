package com.bit.opcode;

import java.util.Scanner;

class HowMuch{
     public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String[] arr = {
			"얼마에요?",
			" %d 원입니다.",
			"몇 개 드릴까요?",
			" %d 개 주세요.\n",
			"총 금액은 %d 입니다\n",
			"비싸요, 깎아주세요 \n",
			"몇 퍼센트나요?",
			" %d 퍼센트요\n",
			" 그럼 %d 원 주세요 ",
			"안남아요, 안팝니다"
	};
	 int price = 0, count = 0, total = 0, percent = 0,
			 result = 0;
	 String text = "";
	 System.out.println(arr[0]);
	 price = s.nextInt();
	 System.out.printf(arr[1], price);
	 System.out.println(arr[2]);
	 count = s.nextInt();
	 System.out.printf(arr[3], count);
	 total = price * count;
	 System.out.printf(arr[4], total);
	 System.out.print(arr[5]);
	 System.out.print(arr[6]);
	 percent = s.nextInt();
	 System.out.printf(arr[7], percent);
	 result = total - (total * percent )/100;
	 if(percent < 10) { text = String.format( arr[8], 
			 result); 
	 }else {text =arr[9]; 
			 }
	 System.out.printf(text);
     }
}