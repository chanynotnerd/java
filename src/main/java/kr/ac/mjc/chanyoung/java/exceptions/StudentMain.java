package kr.ac.mjc.chanyoung.java.exceptions;

public class StudentMain {
	
	public static void main(String[] args) {
		Student std = new Student();
		try {
			std.setStudent(9);
			System.out.format("학생 이름은  %s 입니다.", std.tmp_Student());
		} catch (Attendance e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
