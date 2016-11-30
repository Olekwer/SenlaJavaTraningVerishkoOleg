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

public class SocketProcessor extends Thread {
	private PrintStream os;
	private BufferedReader is;
	private InetAddress addr;
	private Socket socket;
	private Parser parser;
	private ObjectInputStream inputStream=null;
	private	ObjectOutputStream objectOutputStream=null;

	public SocketProcessor(Socket s) throws IOException {
		this.socket = s;	
	}

	public void run() {
	

		try{
			 inputStream = new ObjectInputStream(socket.getInputStream());
			 objectOutputStream= new ObjectOutputStream(socket.getOutputStream());
			
			while(true){			   
				Object n=inputStream.readObject();
				
					if(n!=null){
						String res=get(n);
						System.out.println(res);
						objectOutputStream.writeObject(res);
						objectOutputStream.flush();
					}
					
				
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}finally{
			try {
			//	is.close();
			//	os.close();
				objectOutputStream.close();
				inputStream.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		/*String str;

		List<Object> obE = null;
		String stf = null;
		Object o = null;
		ObjectInputStream io=null;
		
		try {
			//ObjectOutputStream ob = new ObjectOutputStream(socket.getOutputStream());
			
			io = new ObjectInputStream(socket.getInputStream());
			while (true) {
				
				o = io.readObject();
				if (o instanceof List) {
					obE = (List<Object>) o;
					post(obE);
				} else if (o instanceof String) {
					stf = (String) o;
					get(stf);
				}
				// System.out.println("---"+obE.get(0));
				
			}
		

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
		}*/
	}
	/*
	 * get запрос
	 */
	public String get(Object query) {
		String res = null;
		System.out.println("allRooms".equals(query));
		try {
			
			if ("allRooms".equals(query)) {
				res = parser.allRoom();
			} else if ("allGuest".equals(query)) {
				res = parser.allGuest();
			} else if ("allOption".equals(query)) {
				res = parser.allOption();
			} else if("allFreeRoom".equals(query)){
				res=parser.allFreeRoom();
			} else if("capacityRoomSorter".equals(query)){
				res=parser.capacityRoomSorter();
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
		//	disconnect();
		}
		return res;
	}
	
	/*
	 * post запрос
	 */

	public void post(List param) {
		String res=null;
		try {
			String query = (String) param.get(0);
			if ("addGuest".equals(query)) {
				parser.addGuest(param);
			}else if("detailRoom".equals(query)){
				System.out.println(param.get(1));
				res=parser.detailRoom(param);
				os.println(res);
				os.flush();
			}else if("cloneRoom".equals(query)){
				parser.cloneRoom(param);				
			} else if("orderGuest".equals(query)){
				res=parser.orderGuest(param);
				os.println(res);
				os.flush();
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
			//socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			this.interrupt();
		}
	}

}
