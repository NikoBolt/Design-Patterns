package com.company._2_Observer._2_Example;

import java.util.Observable;

public class SimpleSubject extends Observable {
	private int value = 0;
	
	public SimpleSubject() { }
	
	public void setValue(int value) {
		this.value = value;
		setChanged();
		notifyObservers(value);
	}
	
	public int getValue() {
		return this.value;
	}
}