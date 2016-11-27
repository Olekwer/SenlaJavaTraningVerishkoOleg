package oleg.com.example;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.log4j.Logger;

import com.example.oleg.base.DataBase;

public class ServerMain {
	private static Logger log = Logger.getLogger(ServerMain.class);

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		try {
			ServerSocket serv = new ServerSocket(8071);
			System.out.println("initialized");
			while (true) {
				Socket sock = serv.accept();
				System.out.println(sock.getInetAddress().getHostName() + " connected");
				/*
				 * создание отдельного потока для обмена данными с соединившимся
				 * клиентом
				 */
				HttpServer server = new HttpServer(sock);
				server.start();// запуск потока
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
