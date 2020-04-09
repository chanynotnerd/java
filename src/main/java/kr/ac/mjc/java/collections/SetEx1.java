package kr.ac.mjc.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new HashSet<>();
		words.add("java");
		words.add("database");
		words.add("java");

		System.out.println(words);
		System.out.println(words.contains("java"));
		
		for (String element : words) {
			System.out.println(element);
		}
	}
}
