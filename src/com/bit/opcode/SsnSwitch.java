package com.bit.opcode;

import java.util.Scanner;

public class SsnSwitch {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String[] arr = {
    			"이름을 입력해주세요",
    			"주민등록 번호를 입력해주세요",
    			"다시 입력하세요",
    			" %s : %s : %s "
    	};
    	boolean input = true;
    	String name = "", ssn = "", gender = "",
    			text = "";
    	System.out.println(arr[0]);
    	name = scan.next();
    	System.out.println(arr[1]);
    	ssn = scan.next();
    	char ch = ssn.charAt(7);
    	switch(ch) {
    	case '1' : 
    	case '3' : 
    		gender = " 남 ";
    		break;
    	case '2' :
    	case '4': 
    		gender = " 여 ";
    		break;
    	case '5' :
    	case '6' :
    		gender = "외국인"; 
    		break;
    	}		
    	if(ch=='0'||ch=='7'||ch=='8'||ch=='9') {
    		text = arr[2];
    	}else {
    		text = String.format(arr[3], 
				name, ssn, gender);
    	}
    	System.out.printf(text);
    	
    }
}
