package com.rajesh.serializablecheck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableCheck {
	public static void main(String[] args) throws Exception {
		Student student = new Student("Rajesh", 100);
		FileOutputStream fos = new FileOutputStream("C:/Users/16692/Desktop/date.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//oos.writeObject(student);
		oos.flush();
		oos.close();
		System.out.println();
		
		//convert object to byte 
		Student stu = new Student("Rajesh", 100);
		FileOutputStream foss = new FileOutputStream("C:/Users/16692/Desktop/date.ser");
		ObjectOutputStream ooss = new ObjectOutputStream(foss);
		System.out.println(stu.toString());
		ooss.writeObject(stu);
		ooss.flush();
		ooss.close();
		
		//convert byte to object
		try (FileInputStream fileIn = new FileInputStream("C:/Users/16692/Desktop/date.ser");
	             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
	            // Read the object from the file
	            Student person = (Student) objectIn.readObject();
	            
	            // Display the deserialized object
	            System.out.println("Deserialized object:");
	            System.out.println(person);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
				
	            
	            // Display the deserialized object
	            Student s = new Student() {
	            	public String toString() {
	            		System.out.println("check");
						return "check";
	            	}
	            };
	            
		
	}
}
