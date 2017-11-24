package com.bit.opcode;

import java.util.Scanner;

class GradeReport{
     public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a = 0, b = 0, c = 0, avg = 0;
	String name = "", test = "";
	System.out.print("이름?\n");
	name = s.next();
	System.out.print("수학 점수를 입력해주세요\n");
	a = s.nextInt();
	System.out.print("영어 점수를 입력해주세요\n");
	b = s.nextInt();
	System.out.print("국어 점수를 입력해주세요\n");
	c = s.nextInt();
	avg = (a + b + c) / 3;
	
	switch(avg/10){
	case 10 :
		test ="님의 학점은 A 입니다.";
		break;
	case 9 :
		test = "님의 학점은 A 입니다.";
		break;
	case 8 :
		test = "님의 학점은 B 입니다.";
		break;
	case 7 :
		test = "님의 학점은 C 입니다.";
		break;
	case 6 :
		test = "님의 학점은 D 입니다.";
		break;
	case 5 : 
		test = "님의 학점은 E 입니다.";
		break;
	default : 
		test = "님의 학점은 F 입니다.";
		break;
	}
	System.out.printf("%s %s", name, test);
     }
}