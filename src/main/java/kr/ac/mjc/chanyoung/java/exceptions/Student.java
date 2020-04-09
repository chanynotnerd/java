package kr.ac.mjc.chanyoung.java.exceptions;

public class Student {
	private int StudentNumber;
	private String[] NameArray = { "Chanyoung", "Gumin", "Hyeonseung", "Sungbin", "Taemin", "Minwoo", "Chanhee",
									"Seojun", "Juyoung", "Hanseul" };

	public Student() {

	}

public Student (int StudentNumber) throws Attendance {
	setStudent(StudentNumber);
}

public int getStudentNumber() {
	return StudentNumber;
}

public void setStudent(int StudentNumber) throws Attendance {
	if(StudentNumber <= 0 || StudentNumber > 10) 
		throw new Attendance("1에서 10사이의 숫자를 입력해주세요.");
	this.StudentNumber = StudentNumber;
}

public String[] getNameArray() {
	return NameArray;
}

public void setNameArray(String[] nameArray) {
	NameArray = nameArray;
}

public String tmp_Student() {
	return NameArray[StudentNumber-1];
}

}