package com.bit.opcode;

import java.util.Scanner;
public class Whoareyou {
	public static void main(String[] args) {
		String[] arr = {
				"Who are you",
				"당신의 이름은",
				" 입니다 "
		};
		String name = "";
		// Stirng name = initializing 이다.	
		Scanner s = new Scanner(System.in);
		System.out.print(arr[0]);
		name = s.next();
		System.out.printf(arr[1] + name + arr[2]);
	}
}
