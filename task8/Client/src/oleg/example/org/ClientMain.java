package oleg.example.org;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
 * this is Test class
 */
public class ClientMain {
	public static void main(String[] args) throws IOException {
	//	System.out.println(HttpClient.getHttp("limasol"));
		List<Object>list=new ArrayList<Object>();
		Date a =new Date();
		String n="asd";
		list.add(a);
		list.add(n);
		HttpClient.postHttp("abc", list);
	}

}
