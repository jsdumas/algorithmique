package fr.treeptik.designpattern.singleton;

public class Singleton1 {
	
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {
		// TODO Auto-generated constructor stub
	}
	
	public void helloSingeton()
	{
		System.out.println("Hello Singleton");
	}

	public static Singleton1 getInstance()
	{
		return instance;
	}
}
