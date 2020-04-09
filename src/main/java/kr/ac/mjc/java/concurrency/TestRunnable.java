package kr.ac.mjc.java.concurrency;

import java.lang.Thread;

class TimerRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class TestRunnable {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Runnable r1 = new TimerRunnable();
		Thread th1 = new Thread(r1);
		th1.start(); // thread-0

		new Thread(new TimerRunnable()).start(); // 스레드1
//어나니머스
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 100; i < 105; i++) {
					System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		}).start(); // 스레드2
//람다
		new Thread(() -> {
			for (int i = 1000; i < 1005; i++) {
				System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
			}
		}).start(); // 스레드3

		System.out.println("main 스레드 끝");
	}
}