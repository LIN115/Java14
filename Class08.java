package Java14;

import java.io.*;

public class Class08 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("C:\\Users\\zhou6\\物件導向程式設計\\ch14\\aaa.txt");
		FileReader fr2 = new FileReader("C:\\Users\\zhou6\\物件導向程式設計\\ch14\\bbb.txt");
		FileWriter fw = new FileWriter("C:\\Users\\zhou6\\物件導向程式設計\\ch14\\ccc.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedWriter bw = new BufferedWriter(fw);
		String str;

		while ((str = br1.readLine()) != null) {
			bw.write(str);
			bw.newLine();
		}
		while ((str = br2.readLine()) != null) {
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		fw.close();
		fr1.close();
		fr2.close();
	}
}