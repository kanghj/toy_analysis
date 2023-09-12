package resource_leaks;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReturnCloseable2 {

	public Closeable safe() throws FileNotFoundException {
		// we can assume that the caller of this function will handle closing the resource
		FileInputStream var1 = new FileInputStream(new File("/tmp/hello1.txt"));
		return var1;
	}
	
	public void unsafe() throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("/tmp/hello1.txt"));
		fis.read();
	}
}
