package kr.ac.mjc.chanyoung.java.generics;

public class MultipleTypeParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = new Pair<>("Even",8);
		Pair<String, String> p2 = new Pair<>("Hello", "World");
		
		System.out.format("Key=%s, value=%s\n",p1.getKey(),p1.getValue());
		System.out.format("Key=%s, value=%s\n",p2.getKey(),p2.getValue());
	
		System.out.println(p1.toString());
		System.out.println(p2);
	}
}