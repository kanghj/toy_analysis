package resource_leaks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WrappedCloseable22 {

	public void safe2() {
		InputStreamReader isr = null;
        try (InputStream inputStreamReader = new FileInputStream("data2.txt")) {
            isr = new InputStreamReader(inputStreamReader);
            isr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // when inputStreamReader is closed, isr is closed too
	}
}
