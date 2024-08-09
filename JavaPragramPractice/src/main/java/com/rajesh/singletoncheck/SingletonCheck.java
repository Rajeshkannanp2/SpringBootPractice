package com.rajesh.singletoncheck;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import javax.imageio.spi.ImageOutputStreamSpi;

public class SingletonCheck {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//System.out.println(s1==s1);
		
		//reflection
		try {
			Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			Singleton s3 = constructor.newInstance();
			//System.out.println(s1==s3);
		}catch(Exception e) {
			
		}
		
		//serializable
		
//		try {
//            Singleton instance1 = Singleton.getInstance();
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.txt"));
//            out.writeObject(instance1);
//            out.close();
//
//            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.txt"));
//            Singleton instance2 = (Singleton) in.readObject();
//            in.close();
//
//            System.out.println("Instance 1 hash:" + instance1.hashCode());
//            System.out.println("Instance 2 hash:" + instance2.hashCode());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		
		//clonable
		
		try {
			Singleton ss1 = Singleton.getInstance();
			Singleton ss2 = (Singleton) ss1.clone();
		} catch (Exception e) {
          e.printStackTrace();
		}
		
		
	}

}
