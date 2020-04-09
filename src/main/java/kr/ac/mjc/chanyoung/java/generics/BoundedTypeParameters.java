package kr.ac.mjc.chanyoung.java.generics;
@SuppressWarnings("unused")

public class BoundedTypeParameters {
	public static void main(String[] args) {
		NumberBox<Integer> integerBox = new NumberBox<>();
		NumberBox<Double> doubleBox = new NumberBox<>();
	}
}

class NumberBox<T extends Number> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
