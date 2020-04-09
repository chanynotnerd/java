package kr.ac.mjc.java.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public void go() throws IOException {
			//try-with-resources ����
			// AutoCloseable �������̽��� ������ �ڿ��� try������ ()�ӿ� ������
			// finally�� ���� �ʾƵ� �ڵ������� close() �Ѵ�.
			try (FileReader in = new FileReader("/tmp/test.txt")) {
			char c = (char) in.read();
			System.out.println(c);
			} 
			System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void come() throws IOException {
		go();
	}


	public static void main(String[] args) throws IOException {
		FileReaderEx ex = new FileReaderEx();
		ex.come();
	}
}