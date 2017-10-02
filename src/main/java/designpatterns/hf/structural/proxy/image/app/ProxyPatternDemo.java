package designpatterns.hf.structural.proxy.image.app;

import designpatterns.hf.structural.proxy.image.pattern.Image;
import designpatterns.hf.structural.proxy.image.pattern.ProxyImage;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
