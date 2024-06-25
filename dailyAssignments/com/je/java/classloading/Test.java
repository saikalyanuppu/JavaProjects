package com.je.java.classloading;

import java.lang.reflect.Constructor;

public class Test {
	public static void main(String[] args) throws Exception {
		try {
			Class<?> biker = Class.forName("com.je.java.classloading.Bike");
			Constructor<?> constructor = biker.getDeclaredConstructor();
			Bike b = (Bike) constructor.newInstance();
			b.drive();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}