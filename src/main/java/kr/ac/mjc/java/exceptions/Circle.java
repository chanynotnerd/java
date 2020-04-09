package kr.ac.mjc.java.exceptions;

public class Circle {

	private int radius = 1;
	
	public Circle() {
		
		
	}
	
	public Circle(int radius) throws RadiusUnderZeroException {
		setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws RadiusUnderZeroException {
		if(radius < 0)
			throw new RadiusUnderZeroException("�������� 0���� �۽��ϴ�. radius= " +radius);
		this.radius = radius;
	}
	
}
