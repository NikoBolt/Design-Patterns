package com.company._3_Decorator._4_Size;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();

	// используется всеми декораторами
	// и должен передоваться декорируемым объектам
	public Size getSize() {
		return beverage.getSize();
	}
}
