package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java219_network {
	//URL 
	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.daum.net/moviedb/main?movieId=3212");
			System.out.println("getHost():" + url.getHost()); //getHost():movie.daum.net
			System.out.println("getProtocol():" + url.getProtocol()); //getProtocol():https
			System.out.println("getPort():" + url.getPort()); //getport():-1 // port 번호가 없으면 -1
			System.out.println("getPath():" + url.getPath()); //getPath():/moviedb/main
			System.out.println("getQuery():" + url.getQuery()); //getQuery():movieId=3212
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
