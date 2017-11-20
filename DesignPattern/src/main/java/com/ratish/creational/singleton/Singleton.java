package com.ratish.creational.singleton;

/*Singleton pattern ensure that their exist only one instance of class throughout the application*/
public class Singleton {
	private static Singleton instance;

	/*
	 * private constructor ensure that instance could not be created outside
	 * this class
	 */
	private Singleton() {

	}

	/* Double locking for thread safety */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
