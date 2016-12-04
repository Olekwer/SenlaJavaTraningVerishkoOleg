package oleg.com.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import org.apache.log4j.Logger;

import com.example.api.Request;
import com.example.oleg.base.DataBase;

public class SocketProcessor extends Thread {
	private Socket socket;
	private Parser parser = new Parser();
	private ObjectInputStream inputStream = null;
	private ObjectOutputStream objectOutputStream = null;
	private Logger log = Logger.getLogger(DataBase.class);

	public SocketProcessor(Socket s) throws IOException {
		this.socket = s;
	}

	public void run() {

		try {

			while (true) {
				objectOutputStream = new ObjectOutputStream(socket.getOutputStream());	
				inputStream = new ObjectInputStream(socket.getInputStream());
				Object n = inputStream.readObject();

				if (n != null) {
					Request request = (Request) n;
					Object res = parser.invoke(request);
					objectOutputStream.writeObject(res);

					objectOutputStream.flush();

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.info(e);;
		} finally {
			try {
				// is.close();
				// os.close();
				objectOutputStream.close();
				inputStream.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.info(e);
			}

		}
	}



}
