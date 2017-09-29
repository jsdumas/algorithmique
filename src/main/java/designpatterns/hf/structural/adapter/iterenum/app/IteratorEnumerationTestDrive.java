package designpatterns.hf.structural.adapter.iterenum.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import designpatterns.hf.structural.adapter.iterenum.IteratorEnumeration;

public class IteratorEnumerationTestDrive {
	public static void main(String args[]) {
		ArrayList l = new ArrayList(Arrays.asList(args));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
