package kr.ac.mjc.java.Iambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class PersonSearchEx {
	public void printPersons(List<Person> roster, CheckPerson tester) {
		for(Person p : roster) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
	}
	
	public void go() {
		List<Person> roster = new ArrayList<>();
		
		class TeenAger implements CheckPerson {
			@Override
			public boolean test(Person p) {
				return 13 <= p.getAge() && p.getAge() < 20;
		}
	}
	printPersons(roster, new TeenAger());
	
	CheckPerson teenAger = new CheckPerson() {
		@Override
		public boolean test(Person p) {
			return 13 <= p.getAge() && p.getAge() < 20 ;
		}
	};
	printPersons(roster, teenAger);
	
	printPersons(roster, new CheckPerson() {
		@Override
		public boolean test(Person p) {
			return 13 <= p.getAge() && p.getAge() < 20;
		}
	});
	
	printPersons(roster, (p) -> {
		return 13 <= p.getAge() && p.getAge() < 20;
	});
	
	printPersons(roster,(p) -> {
		return p.getGender() == Person.Gender.MALE && p.getAge() >= 18;
	});
	
	printPersons(roster, (p) -> {
		return p.getEmail().endsWith("@gmail.com");
	});
	
	printPersons(roster, (p) -> {
		return "Jacob".equals(p.getName());
	});
}
public static void main(String[] args) {
	new PersonSearchEx().go();
}
}
