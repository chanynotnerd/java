package kr.ac.mjc.java.Iambdaexpression;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
	public enum Gender {
		MALE, FEMALE
	}
	
	String name;
	LocalDate birthday;
	Gender gender;
	String email;
	
	public Person(String name, LocalDate birthday, Gender gender,
				String email) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		long years = birthday.until(LocalDate.now(), ChronoUnit.YEARS);
		return(int) years;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + 
				", gender=" + gender + ", email=" + email + "]";
	}
	public void printPerson() {
		System.out.println(this);
	}


	
}
