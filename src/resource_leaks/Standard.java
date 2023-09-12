package resource_leaks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Standard {
	void safe(String[] files) throws IOException, FileNotFoundException {
		FileInputStream stream;

		stream = new FileInputStream(files[0]);

		stream.close();
	}
	
	void unsafe(String[] files) throws IOException, FileNotFoundException {
		FileInputStream stream;

		stream = new FileInputStream(files[0]);

	}

}
