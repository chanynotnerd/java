package kr.ac.mjc.chanyoung.java.concurrency;

public class GugudanEx{
	public static void main(String[] args) {
		System.out.println("구구단을 외자! 구구단을 외자! \n");
		
		Gugudan gugu = new Gugudan();

	new Thread(() -> {
		gugu.use(2);
	}).start();
	
	new Thread(() -> {
		gugu.use(3);
	}).start();
	
	new Thread(() -> {
		gugu.use(4);
	}).start();
	
	new Thread(() -> {
		gugu.use(5);
	}).start();
	
	new Thread(() -> {
		gugu.use(6);
	}).start();
	
	new Thread(() -> {
		gugu.use(7);
	}).start();
	
	new Thread(() -> {
		gugu.use(8);
	}).start();
	
	new Thread(() -> {
		gugu.use(9);
	}).start();
}
}
	
class Gugudan {
	public synchronized void use(int a) {
		System.out.format("%d단 시작!\n", a);
		for(int i = 1; i < 10; i++) {
			System.out.format("%d * %d = %d\n", a, i, a*i);
		}
	}
}