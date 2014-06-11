package com.lcs.JSON;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

import javax.json.*;
import javax.json.stream.*;


public class JsonGrabber {

	public static void readFromURL (String urlPath) {
		
		
		try {
			URLConnection connection = new URL(urlPath).openConnection();
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
			connection.connect();
			InputStream is = connection.getInputStream();
			JsonParser js = Json.createParser(is);
			
			while (js.hasNext()) {
				   JsonParser.Event event = js.next();
				   switch(event) {
				      case START_ARRAY:
				    	  break;
				      case END_ARRAY:
				    	  break;
				      case START_OBJECT:
				    	  System.out.print(event.toString());
				    	  break;
				      case END_OBJECT:
				      case VALUE_FALSE:
				      case VALUE_NULL:
				      case VALUE_TRUE:
				         //System.out.println(event.toString());
				         break;
				      case KEY_NAME:
				    	  System.out.println(" " + event.toString() + " " + js.getString());
				         //System.out.print(event.toString() + " " + js.getString() + " - ");
				         break;
				      case VALUE_STRING:
				      case VALUE_NUMBER:
				         //System.out.println(event.toString() + " " + js.getString());
				         break;
				   }
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String [] args) throws IOException {
		String url = "http://fantasy.na.lolesports.com/en-US/api/season/4";
		readFromURL(url);
	}
	
	
}
