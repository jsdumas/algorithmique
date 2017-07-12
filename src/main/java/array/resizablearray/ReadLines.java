package array.resizablearray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {

	public static void main(String[] args) throws IOException {
		ResizableArray r = new ResizableArray(0);
		BufferedReader f = new BufferedReader(new FileReader("numbers.txt"));
		while (true) {
			String s = f.readLine();
			if (s == null)
				break;
			System.out.println(s);
			r.append(Integer.parseInt(s));
		}
		System.out.println(r.getSize() + " lines");
		f.close();
	}

}
