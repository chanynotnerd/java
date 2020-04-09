package kr.ac.mjc.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(-1);
		
		list.add(2, 100);
		System.out.println(list);
		System.out.println("����Ʈ�� ������Ʈ ����: "+list.size());
		
		int n = list.get(3);
		System.out.println(n);
		
		for(int m : list) {
			System.out.format("%d ", m);
		}
		System.out.println();
	}
}
