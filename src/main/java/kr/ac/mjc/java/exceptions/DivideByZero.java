package kr.ac.mjc.java.exceptions;

import java.util.Scanner;

public class DivideByZero {

	public void go() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int dividend = scanner.nextInt();
		System.out.print("�и� �Է��ϼ��� : ");
		int divisor = scanner.nextInt();
		try {
		int result = dividend/divisor;
		System.out.format("%d/%d = %d\n", dividend, divisor, result);
		} catch(ArithmeticException e) {
			// ArithmeticException�� �߻��� ��쿡 ó���ϴ� ����
			System.out.println(e);
		}
		scanner.close();
		System.out.println("��ĳ�ʸ� �����ϰ� ���α׷��� ���������� �����մϴ�.");
	}
	
	public void come() {
		go();
		}

	public static void main(String[] args) {
		DivideByZero zero = new DivideByZero();
		zero.come();
}
}
