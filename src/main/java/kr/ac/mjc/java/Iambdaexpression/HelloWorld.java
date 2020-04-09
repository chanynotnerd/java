package kr.ac.mjc.java.Iambdaexpression;

public class HelloWorld {
	public void go() {
		class EnglishGreeting implements Greeting {
			@Override
			public void greet() {
				System.out.println("Hello.");
			}
		}
		Greeting englishGreeting = new EnglishGreeting();
		sayHello(englishGreeting);
		
		Greeting frenchGreeting = new Greeting() {
			@Override
			public void greet() {
				System.out.println("Bonjour.");
			}
		};
		sayHello(frenchGreeting);
		
		sayHello(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hola. ");
			}
		});
		
		sayHello(() -> {
			System.out.println("안녕하세요.");
		});
	}
	public void sayHello(Greeting greeting) {
		greeting.greet();
	}
	public static void main(String[] args) {
		new HelloWorld().go();
	}
}
