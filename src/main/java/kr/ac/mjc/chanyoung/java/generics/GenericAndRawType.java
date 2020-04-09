package kr.ac.mjc.chanyoung.java.generics;
@SuppressWarnings("unused")

public class GenericAndRawType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleBox box = new SimpleBox();
		box.set(5);
		Integer n1 = (Integer) box.get(); //Type casting. Object _> Integer
		
		box.set("choi");
		String s1 = (String) box.get();

		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(5);
		int n2 = integerBox.get();
		
		Box<String> stringBox = new Box<>();
		stringBox.set("choi");
		String s2 = stringBox.get();
		
		Box rawBox = new Box();
		rawBox.set(5);
		Integer n3 = (Integer) rawBox.get();
	}
}

class SimpleBox {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}
