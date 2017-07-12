package array.stack;

import java.util.NoSuchElementException;

import array.resizablearray.ResizableArray;

// Structure de pile
public class Stack implements IStack {

	private final ResizableArray resizableArray;

	public Stack() {
		this.resizableArray = new ResizableArray(0);
	}

	public boolean isEmpty() {
		return this.resizableArray.getSize() == 0;
	}

	public int size() {
		return this.resizableArray.getSize();
	}

	public void clear() {
		this.resizableArray.setSize(0);
	}

	public void push(int x) {
		int arrayLength = this.resizableArray.getSize();
		this.resizableArray.setSize(arrayLength + 1);
		this.resizableArray.setItemsValue(arrayLength, x);
	}

	public int pop() {
		int arrayLength = this.resizableArray.getSize();
		if (arrayLength == 0)
			throw new NoSuchElementException();
		int e = this.resizableArray.getItemsValue(arrayLength - 1);
		this.resizableArray.setSize(arrayLength - 1);
		return e;
	}

	public int top() {
		int arrayLength = this.resizableArray.getSize();
		if (arrayLength == 0)
			throw new NoSuchElementException();
		return this.resizableArray.getItemsValue(arrayLength - 1);
	}

	public void swap() {
		int arrayLength = this.resizableArray.getSize();
		if (arrayLength <= 1)
			throw new IllegalArgumentException();
		int tmp = this.resizableArray.getItemsValue(arrayLength - 1);
		this.resizableArray.setItemsValue(arrayLength - 1, this.resizableArray.getItemsValue(arrayLength - 2));
		this.resizableArray.setItemsValue(arrayLength - 2, tmp);
	}

}