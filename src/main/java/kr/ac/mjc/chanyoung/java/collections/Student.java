package kr.ac.mjc.chanyoung.java.collections;

import java.util.Objects;

public class Student {
	private String sName;
	private int sNum;
	
	public Student() {
		
	}

	public Student(String sName, int sNum) {
		super();
		this.sName = sName;
		this.sNum = sNum;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	@Override
	public String toString() {
		return "Student [sNum=" + sNum + ", sName=" + sName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return this.sName == student.getsName() && 
				   this.sNum == student.getsNum();
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(sName);
	}
}
