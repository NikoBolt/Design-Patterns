package com.company._11_Proxy._3;

import java.io.Serializable;

			// теперь Serializable
public interface State extends Serializable {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
