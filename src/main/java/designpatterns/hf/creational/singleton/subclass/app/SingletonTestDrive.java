package designpatterns.hf.creational.singleton.subclass.app;

import designpatterns.hf.creational.singleton.subclass.pattern.CoolerSingleton;
import designpatterns.hf.creational.singleton.subclass.pattern.HotterSingleton;
import designpatterns.hf.creational.singleton.subclass.pattern.Singleton;

public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
