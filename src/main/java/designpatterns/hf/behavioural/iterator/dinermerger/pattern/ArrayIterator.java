package designpatterns.hf.behavioural.iterator.dinermerger.pattern;

import designpatterns.hf.behavioural.iterator.dinermerger.menu.MenuItem;

public class ArrayIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	public ArrayIterator(MenuItem[] items) {
		this.items = items;
	}
 
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
