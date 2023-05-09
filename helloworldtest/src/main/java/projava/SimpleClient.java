package projava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		try (var soc = new Socket("localhost", 1600);
				OutputStream is = soc.getOutputStream();) 
		{
			is.write(234);
		} catch (ConnectException e) {
			System.out.println("サーバーが起動していません");
		}
	}
}
