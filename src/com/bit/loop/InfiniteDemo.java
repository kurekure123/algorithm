package com.bit.loop;

import java.util.Scanner;

public class InfiniteDemo {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String text = "";
    	int input = 0; 
    	while(true) {
    		System.out.println("[메뉴] 0. 정지, 1. bmi, 2. 계산기, 3. 성적");
    		input = scanner.nextInt();
    		switch( input ){
    		case 0 :
    			text = "시스템이 종료 되었습니다.";
    			return;
    		case 1 : 
    			break;
    		
    		}
    		System.out.println(text);
    	}
    }
}
