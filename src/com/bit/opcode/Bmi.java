package com.bit.opcode;

/*
고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만
if(18.5 <= bmi && bmi < 22.9)
실수는 %f
 * */
import java.util.Scanner;

public class Bmi {
   public static void main(String[] args) {
	   String res = "";
	   Scanner s = new Scanner(System.in);
	   int customer = 0;
	   String[] arr= {
			   "당신의 이름을 남겨주세요",
			   "당신의 키는 몇미터인가요?",
			   "당신의 몸무게는 몇키로 인가요?",
			   "체중은 정상입니다.",
			   "저체중 입니다.",
			   "경도 비만 입니다.",
			   "중등도 비만 입니다.",
			   "고도 비만 입니다.",
			   " %s 님은 %s\n"
	   };
	   System.out.println("몇 분이세요?");
	   customer = s.nextInt();
	   for(int i = 1; i <= customer; i++) {
	   String name = "", text ="";
	   double high = 0.0, weight = 0.0, bmi = 0.0;
				System.out.println(arr[0]);
				name = s.next();
				System.out.println(arr[1]);
				high = s.nextDouble()/100;
				System.out.println(arr[2]);
				weight = s.nextDouble();
				bmi = weight / (high*high);
				if(bmi >= 18.5 && bmi < 22.9 ) {
					text = arr[3];
				}else if(bmi < 18.5){
					text = arr[4];
				}else if(bmi >=25 && bmi < 30){
					text = arr[5];
				}else if(bmi <= 30 && bmi < 35) {
					text = arr[6];
				}else if(bmi >= 35) {
					text = arr[7];
				}
				res += String.format(arr[8], name, text);
			}
		System.out.println(res);
   }
}
