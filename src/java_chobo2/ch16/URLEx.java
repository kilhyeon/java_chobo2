package java_chobo2.ch16;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class URLEx {

	public static void main(String[] args) throws IOException, URISyntaxException {
		getInfoURL01();
		System.out.println();
		getInfoURL02();
		

	}

	private static void getInfoURL02() throws IOException {
		URL url = new URL("http://www.naver.com");
		URLConnection conn = url.openConnection();
		System.out.println("conn.toString():" + conn);
		System.out.println("getAllowUserInteraction():" + conn.getAllowUserInteraction());
		System.out.print("\tgetConnectTimeout():" + conn.getConnectTimeout());
		System.out.println("getContent():" + conn.getContent());
		System.out.println("getContentEncoding():" + conn.getContentEncoding());
		System.out.print("\tgetContentLength():" + conn.getContentLength());
		System.out.println("getContentType():" + conn.getContentType());
		System.out.print("\tgetDate():" + conn.getDate());
		System.out.println("getDefaultAllowUserInteraction():" + conn.getDefaultAllowUserInteraction());
		System.out.println("getDefaultUseCaches():" + conn.getDefaultUseCaches());
		System.out.print("\tgetDoInput():" + conn.getDoInput());
		System.out.println("getDoOutput():" + conn.getDoOutput());
		System.out.print("\tgetExpiration():" + conn.getExpiration());
		System.out.println("getHeaderFields():" + conn.getHeaderFields());
		System.out.println("getIfModifiedSince():" + conn.getIfModifiedSince());
		System.out.print("\tgetLastModified():" + conn.getLastModified());
		System.out.println("getReadTimeout():" + conn.getReadTimeout());
		System.out.println("getURL():" + conn.getURL());
		System.out.println("getUseCaches():" + conn.getUseCaches());
		
	}

	public static void getInfoURL01() throws MalformedURLException, IOException, URISyntaxException {
		URL url = new URL("http://www.naver.com");
		System.out.println("url.getAuthority() : " + url.getAuthority());
		System.out.println("url.getContent() : " + url.getContent());
		System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
		System.out.println("url.getPort() : " + url.getPort());
		System.out.println("url.getFile() : " + url.getFile());
		System.out.println("url.getHost() : " + url.getHost());
		System.out.println("url.getgetPath() : " + url.getPath());
		System.out.println("url.getProtocol() : " + url.getProtocol());
		System.out.println("url.getQuery() : " + url.getQuery());
		System.out.println("url.getRef() : " + url.getRef());
		System.out.println("url.getUserInfo() : " + url.getUserInfo());
		System.out.println("url.toExternalForm() : " + url.toExternalForm());
		System.out.println("url.toURI() : " + url.toURI());
	}

}
