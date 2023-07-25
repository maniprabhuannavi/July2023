package com.API_Automation;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionPractice {

	public static void getRequest() throws Throwable {
		// TODO Auto-generated method stub
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);

		String responseMessage = connection.getResponseMessage();
		System.out.println(responseMessage);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader beffReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = beffReader.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws Throwable {
		getRequest();
	}
}
