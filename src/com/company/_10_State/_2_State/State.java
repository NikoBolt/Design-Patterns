package com.company._10_State._2_State;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

    public void refill();
}
