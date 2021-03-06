package designpatterns.hf.behavioural.iterator.dinermerger.pattern;

import java.util.Calendar;

import designpatterns.hf.behavioural.iterator.dinermerger.menu.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position;

	public AlternatingDinerMenuIterator(MenuItem[] list) {
		this.list = list;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.DAY_OF_WEEK % 2;
	}
	public Object next() {
		MenuItem menuItem = list[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternating Diner Menu Iterator";
	}
}
