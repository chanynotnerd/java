//2016041056 김찬영 예제 8-1

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		try {
			in = new FileInputStream("c:\\windows\\system.ini");
			
			int c;
			while ((c = in.read()) != -1) {
					System.out.print((char)c);
			}
			in.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
