package kr.ac.mjc.chanyoung.java.generics;

public class Util {
	public <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		return p1.getKey().equals(p2.getKey())
			&& p1.getValue().equals(p2.getValue());
	}
	
	public <T> boolean compare(Box<T> b1, Box<T> b2) {
		return b1.get().equals(b2.get());
	}
	
	
}
