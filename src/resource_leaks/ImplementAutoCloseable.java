package resource_leaks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ImplementAutoCloseable {

	public static void safe() throws IOException {
		Path tmpZip = Files.createTempFile("here", null, null);
		try (ZipFile zipFile = new ZipFile("here1");
				ZipOutputStream out = new ZipOutputStream(Files.newOutputStream(tmpZip))) {

			System.out.println("");
		}
	}

	public static void unsafe() throws IOException {
		Path tmpZip = Files.createTempFile( "here", null, null );
		
		ZipFile zipFile = new ZipFile( "here1" );
		ZipOutputStream out = new ZipOutputStream( Files.newOutputStream( tmpZip ));
		
		System.out.println("");
		 
	}
}
