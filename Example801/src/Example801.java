import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example801 {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("test.txt");
		    int b = 0;
		    while(true) {
			   try {
				b = in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			   if(b == -1) {
				  break;
			   }
			  System.out.println(b);
		   }
		    try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//in.close();
	}

}
