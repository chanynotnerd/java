package kr.ac.mjc.java.exceptions;

public class CircleTestMain {
	
	public static void main(String[] args) {
	
		Circle c1 = new Circle();
		c1.setRadius(-5);
		System.out.format("c1�� �������� %d�Դϴ�.\n",c1.getRadius());
		
		
		
			Circle c2 = new Circle(10);
			System.out.format("c1�� �������� %d�Դϴ�.\n",c2.getRadius());
	}
}
