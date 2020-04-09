package kr.ac.mjc.chanyoung.java.collections;

import java.util.HashSet;
import java.util.Set;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> EEStudent = new HashSet<>();
		
		Student s1 = new Student("곽두팔",2020041099);
		Student s2 = new Student("성쌍필",2020041084);
		Student s3 = new Student("김찬영",2016041056);
		Student s4 = new Student("곽두팔",2020041099);
		
		EEStudent.add(s1);
		EEStudent.add(s2);
		System.out.println(EEStudent.contains(s3));
		EEStudent.add(s3);
		System.out.println(EEStudent.contains(s4));
		EEStudent.add(s4);
		System.out.println();
		
		System.out.println("전자공학과 학생 이름과 학번(파라미터 값): "+EEStudent);
		System.out.println();
		System.out.println("두 학생 비교 : 같으면 true, 다르면 false");
		System.out.println();
		
		System.out.println("곽두팔과 성쌍필은 같은 학생인가요? "+s1.equals(s2));
		System.out.println("곽두팔과 김찬영은 같은 학생인가요? "+s1.equals(s3));
		System.out.println("곽두팔과 곽두팔은 같은 학생인가요? "+s1.equals(s4));
		System.out.println();
		
		System.out.println("곽두팔의 hashCode() :" + s1.hashCode() + "\n"
							+ "성쌍필의 hashCode() :" +s2.hashCode() + "\n"
							+ "김찬영의 hashCode() :" +s3.hashCode() + "\n"
							+ "곽두팔의 hashCode() :" +s4.hashCode() + "\n");
	}
}