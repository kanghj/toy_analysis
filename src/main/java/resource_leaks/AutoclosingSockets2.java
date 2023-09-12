package resource_leaks;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

import javax.net.ssl.SSLContext;

public class AutoclosingSockets2 {

	public void safe(SSLContext context) throws IOException {
		
		Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("www.hello1.com", 81), 1100);
            // the last parameter `autoClose` is set to true, thus socket is not leaked.
            socket = context.getSocketFactory().createSocket(socket, "www.hello1.com", 81, true);
        }
        catch (Throwable t) {
            // something went wrong, close the socket and rethrow
            socket.close();
            throw new RuntimeException(t);
        }
	}
	
	
	public void safe2(SSLContext context) throws IOException {
		
		Socket socket = new Socket();
        try {
        	InetSocketAddress intAddress = new InetSocketAddress("www.hello2.com", 82);
            socket.connect(intAddress, 1101);
            // the last parameter `autoClose` is set to true, thus socket is not leaked.
            socket = context.getSocketFactory().createSocket(socket, "www.hello2.com", 82, true);
        }
        catch (Throwable t) {
            // something went wrong, close the socket and rethrow
            socket.close();
            throw new RuntimeException(t);
        }
	}
}
