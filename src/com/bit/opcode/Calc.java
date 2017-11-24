package com.bit.opcode;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String[] arr = new String[5];
    	arr[0] = "+";
    	arr[1] = "-";
    	arr[2] = "*";
    	arr[3] = "/";
    	arr[4] = "%";
    	int num1 = 0, num2 = 0, result = 0; 
    	String opcode = "";
    	System.out.print("첫번째 숫자를 입력해주세요.\n");
    	num1 = s.nextInt();
    	System.out.print("두번째 숫자를 입력해주세요.\n");
    	num2 = s.nextInt();
    	System.out.print("연산자를 입력해주세요.\n");
    	opcode = s.next();
    	if(opcode.equals(arr[0])) {
    		result = num1 + num2;
    	}else if(opcode.equals(arr[1])){
    		result = num1 - num2;
    	}else if(opcode.equals(arr[2])){
    		result = num1 * num2;
    	}else if(opcode.equals(arr[3])){
    		result = num1 / num2;
    	}else if(opcode.equals(arr[4])){
    		result = num1 % num2;
    	}
    	System.out.printf("%d %s %d = %d", 
    			num1, opcode, num2, result);
        }
}
