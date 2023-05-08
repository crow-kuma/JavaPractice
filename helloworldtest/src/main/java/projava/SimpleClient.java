package projava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		var soc = new Socket("localhost", 1700);
		OutputStream output = soc.getOutputStream();
		output.write(234);
		output.close();
		soc.close();
	}
}
