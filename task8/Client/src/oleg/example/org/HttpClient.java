package oleg.example.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class HttpClient {
	/*
	 * get query server
	 */	
	public static String getRestHttp(String query) throws IOException{
		String res=null;
		Socket s=null;
		BufferedReader br=null;
		ObjectOutputStream oos=null;
		StringBuffer  stringBuffer=new StringBuffer ();
		try {
			s = new Socket(InetAddress.getLocalHost(), 8071);
		//	PrintStream ps = new PrintStream(s.getOutputStream());
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			oos = new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(query);
			res=br.readLine();
			while(true){
				String tttt=br.readLine();
				if(tttt==null || tttt.isEmpty()){
					
					break;
				}
				stringBuffer.append(tttt+'\n');
				//break;
			}
			//res=br.readLine();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			oos.close();
			br.close();
			s.close();
		}		
		
		return stringBuffer.toString();
	}
	
	/*
	 * post query server
	 */	
	public static String postHttp(String query, List<Object> args) throws IOException{
		StringBuffer stringBuffer=new StringBuffer();
		Socket s=null;
		BufferedReader br=null;
		ObjectOutputStream oos=null;
		try {
			s = new Socket(InetAddress.getLocalHost(), 8071);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//PrintStream ps = new PrintStream(s.getOutputStream());
			args.add(0,query);
			oos = new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(args);
			oos.flush();
			
			while(true){
				String tttt=br.readLine();
				if(tttt==null || tttt.isEmpty()){					
					break;
				}
				stringBuffer.append(tttt+'\n');
				//break;
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			oos.close();
			s.close();
		}
		
		return stringBuffer.toString();
	}
}
