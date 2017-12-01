package com.bit.opcode;

import java.util.Scanner;

/*
 사용자가 원하는대로 숫자를 입력하게 하고 0을 누르면 총 누적된 합계를 보여주는 어플
 * */

public class InputSum {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String opcode = "";
    int num = 0, res = 0, num2 = 0;
    while(true) {
    	System.out.println("수를 입력해주세요, 0. 계산 값 출력");
    	num = scanner.nextInt();
    	switch(num) {
    		case 0 : 
    			System.out.println(res);
    			return;
    		default : 
    			System.out.println("연산자를 입력해주세요");
    			opcode = scanner.next();
    			switch(opcode) {
    			case "+" :
    				res += num;
    			case "-" :
    				res -= num;
    			}
    			System.out.println(res);
    	}
    }
    }

}
