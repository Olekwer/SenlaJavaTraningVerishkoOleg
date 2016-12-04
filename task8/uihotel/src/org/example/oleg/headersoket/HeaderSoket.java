package org.example.oleg.headersoket;

import java.net.Socket;

public class HeaderSoket {
	private static Socket socket;
	public HeaderSoket(Socket socket){
		this.socket=socket;
	}
	public static Socket getSocket(){
		return socket;
	}
}
