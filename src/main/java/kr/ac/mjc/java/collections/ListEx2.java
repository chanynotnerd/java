package kr.ac.mjc.java.collections;


import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Point> list = new ArrayList<>();
		
		list.add(new Point(2,3));
		list.add(new Point(-5,20));
		list.add(new Point(30,-8));
		
		list.remove(1);
		System.out.println(list);
		
		
		Point p1 = list.get(1);
		System.out.println(p1);
		
		for (Point p : list) {
			System.out.println(p);
		}
	}
}
