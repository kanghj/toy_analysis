package resource_leaks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WrappedCloseable {

	public void safe() {
		InputStreamReader isr = null;
        try (InputStream inputStreamReader = new FileInputStream("data.txt")) {
            isr = new InputStreamReader(inputStreamReader, StandardCharsets.UTF_8);
            isr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // when inputStreamReader is closed, isr is closed too
	}
}
