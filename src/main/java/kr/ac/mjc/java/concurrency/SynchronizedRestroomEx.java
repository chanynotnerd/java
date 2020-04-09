package kr.ac.mjc.java.concurrency;

public class SynchronizedRestroomEx {
	public static void main(String[] args) {
		SynchronizedRestroom restroom = new SynchronizedRestroom();
		
		new Thread(new Person(restroom)).start(); //0번
		new Thread(new Person(restroom)).start(); //1번
		new Thread(new Person(restroom)).start(); //2번
	}
}

class SynchronizedRestroom {
	public synchronized void use() {
		System.out.format("%s : 화장실에 들어갔다\n",
			Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
		}
		System.out.format("%s : 화장실에서 나왔다\n", 
				Thread.currentThread().getName());
	}
}

class Person implements Runnable {
	private SynchronizedRestroom restroom;
	
	public Person(SynchronizedRestroom restroom) {
		this.restroom = restroom;
	}
	
	@Override
	public void run() {
		restroom.use();
	}
}

