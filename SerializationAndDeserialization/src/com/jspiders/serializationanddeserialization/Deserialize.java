package com.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	
	public static void main(String[] args) {
		File file = new File("Demo1.txt");
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			User user = (User)objectInputStream.readObject();
			System.out.println(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
		finally {
			try {
				objectInputStream.close();
				fileInputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}

}
