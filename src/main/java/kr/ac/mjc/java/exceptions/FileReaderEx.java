package kr.ac.mjc.java.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public void go() throws IOException {
			//try-with-resources 구문
			// AutoCloseable 인터페이스를 구현한 자원을 try구문의 ()속에 넣으면
			// finally를 쓰지 않아도 자동적으로 close() 한다.
			try (FileReader in = new FileReader("/tmp/test.txt")) {
			char c = (char) in.read();
			System.out.println(c);
			} 
			System.out.println("프로그램을 종료합니다.");
	}
	
	public void come() throws IOException {
		go();
	}


	public static void main(String[] args) throws IOException {
		FileReaderEx ex = new FileReaderEx();
		ex.come();
	}
}