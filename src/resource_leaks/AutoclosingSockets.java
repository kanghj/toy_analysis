package resource_leaks;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

import javax.net.ssl.SSLContext;

public class AutoclosingSockets {

	public void safe() {
		
		Socket socket = new Socket(Proxy.NO_PROXY);
        try {
            socket.connect(new InetSocketAddress("www.hello.com", 80), 1000);

            
            SSLContext sslContext = SSLContext.getDefault(); 

            // the last parameter `autoClose` is set to true, thus socket is not leaked.
            socket = sslContext.getSocketFactory().createSocket(socket, "www.hello.com", 80, true);
        }
        catch (Throwable t) {
            // something went wrong, close the socket and rethrow
            try {
                socket.close();
            }
            catch (IOException e) {
                t.addSuppressed(e);
            }
            
            throw new RuntimeException(t);
        }
	}
}
