package oleg.com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;

public class HttpServer extends Thread {
	private PrintStream os;
	private BufferedReader is;
	private InetAddress addr;
	private Socket socket;
	private Interprator interprator;

	public HttpServer(Socket s) throws IOException {
		this.socket = s;
		os = new PrintStream(s.getOutputStream());
		is = new BufferedReader(new InputStreamReader(s.getInputStream()));
		addr = s.getInetAddress();
		interprator = new Interprator();
	}

	public void run() {

		String str;

		List<Object> obE = null;
		String stf = null;
		Object o = null;
		ObjectInputStream io=null;
		try {
			//ObjectOutputStream ob = new ObjectOutputStream(socket.getOutputStream());
			io = new ObjectInputStream(socket.getInputStream());
			o = io.readObject();
			/*
			 * определяем тип запроса. Можно определить и по названию. Определяю по типу. List - post. String - get
			 */
			if (o instanceof List) {
				obE = (List<Object>) o;
				post(obE);
			} else if (o instanceof String) {
				stf = (String) o;
				get(stf);
			}
			// System.out.println("---"+obE.get(0));
			io.close();

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			disconnect();// уничтожение потока
			try {
				io.close();
			} catch (IOException e) {
			}
		}
	}
	/*
	 * get запрос
	 */
	public void get(String query) {
		try {
			String res = null;
			if ("allRooms".equals(query)) {
				res = interprator.allRoom();
			} else if ("allGuest".equals(query)) {
				res = interprator.allGuest();
			} else if ("allOption".equals(query)) {
				res = interprator.allOption();
			} else if("allFreeRoom".equals(query)){
				res=interprator.allFreeRoom();
			} else if("capacityRoomSorter".equals(query)){
				res=interprator.capacityRoomSorter();
			}
			os.println(res);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			disconnect();
		}

	}
	
	/*
	 * post запрос
	 */

	public void post(List param) {
		String res=null;
		try {
			String query = (String) param.get(0);
			if ("addGuest".equals(query)) {
				interprator.addGuest(param);
			}else if("detailRoom".equals(query)){
				System.out.println(param.get(1));
				res=interprator.detailRoom(param);
				os.println(res);
			}else if("cloneRoom".equals(query)){
				interprator.cloneRoom(param);				
			} else if("orderGuest".equals(query)){
				res=interprator.orderGuest(param);
				os.println(res);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			disconnect();
		}
	}
	/*
	 * закрываю потоки
	 */
	public void disconnect() {
		try {
			System.out.println(addr.getHostName() + " disconnected");
			os.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			this.interrupt();
		}
	}

}
