import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest {

	public static void main(String[] args) {

		String path = "c:\\text\\text.txt";
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(path);
//			is : InputStream
			
			int BUFF = 1024;
			byte[] readBytes = new byte[BUFF];
			
		
			while(is.read(readBytes) != -1) {
				String read = new String(readBytes);
				System.out.println(read);
			}
			
			String path2 = "c:\\text\\text2.txt";
			String data = "abc\nABC\n\t한글\n123";
			
			os = new FileOutputStream(path2);
			byte[] data1 = data.getBytes();
			os.write(data1);
			os.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(is != null) {
				try {
					is.close();
				}	catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(os != null) {
				try {
					is.close();
				}	catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
//		경로가 없을 수 있으니 예외처리
	}

}