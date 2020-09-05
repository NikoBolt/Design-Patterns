package com.company._2_Observer._4_Util_Observer.Example;

import java.util.Observable;

public class SimpleSubject extends Observable {
	private int value = 0;
	
	public SimpleSubject() { }
	
	public void setValue(int value) {
		this.value = value;
		setChanged();   // -> changed = true
        // защита от лишних оповещений
		notifyObservers(value); // if changed -> call update -> changed = false
	}
	
	public int getValue() {
		return this.value;
	}
}