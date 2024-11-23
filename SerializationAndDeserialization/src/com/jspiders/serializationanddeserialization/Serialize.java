package com.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
 public static void main(String[] args) {
	User user  = new User("Ramesh", "ramesh@gmail.com",9307121772L,"Ramesh@123");
	File file = new File("Demo1.txt");
	FileOutputStream fileOutputStream = null;
	ObjectOutputStream objectOutputStream = null;
	
	try {
		fileOutputStream = new FileOutputStream(file);
		objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		System.out.println("Object has been Serialize..");
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("Something Went Wrong");
	}
	finally {
		try {
			objectOutputStream.close();
			fileOutputStream.close();
			
		} catch (IOException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	
}
}
