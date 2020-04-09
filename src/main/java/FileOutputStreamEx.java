//2016041056 김찬영 예제 8-2

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("c:\\tmp\\test.txt");
			FileInputStream fin = null;
			for (int i = 0; i<10; i++) {
				int n = 10 - i;
				fout.write(n);
			}
			fout.close();
			fin = new FileInputStream("c:\\tmp\\test.txt");
			
			int c = 0;
			while ((c = fin.read()) != -1) {
				System.out.println(c+" ");
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
