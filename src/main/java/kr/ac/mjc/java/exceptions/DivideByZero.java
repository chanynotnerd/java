package kr.ac.mjc.java.exceptions;

import java.util.Scanner;

public class DivideByZero {

	public void go() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("분자를 입력하세요 : ");
		int dividend = scanner.nextInt();
		System.out.print("분모를 입력하세요 : ");
		int divisor = scanner.nextInt();
		try {
		int result = dividend/divisor;
		System.out.format("%d/%d = %d\n", dividend, divisor, result);
		} catch(ArithmeticException e) {
			// ArithmeticException이 발생할 경우에 처리하는 구문
			System.out.println(e);
		}
		scanner.close();
		System.out.println("스캐너를 종료하고 프로그램을 정상적으로 종료합니다.");
	}
	
	public void come() {
		go();
		}

	public static void main(String[] args) {
		DivideByZero zero = new DivideByZero();
		zero.come();
}
}
