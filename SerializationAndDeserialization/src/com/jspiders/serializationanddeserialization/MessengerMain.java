package com.jspiders.serializationanddeserialization;
import java.io.IOException;
public class MessengerMain {
	public static void main(String[] args) throws IOException ,ClassNotFoundException{
		Messenger messanger = new Messenger();
		messanger.send("Hi, How are you? ");
		System.out.println(messanger.receive());
		
	}

}
