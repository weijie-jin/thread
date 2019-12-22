//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;

public class Example802 {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("testout.txt");
		String str = "安阳师范学院";
		byte [] b = str.getBytes();
		for(int i=0; i<b.length;i++) {
			out.write(b[i]);
		}
		out.close();
	}

}
