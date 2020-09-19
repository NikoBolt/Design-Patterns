package com.company._7_1_Adapter._2_DuckAdapter;

import com.company._7_1_Adapter._2_DuckAdapter.Objects.MallardDuck;
import com.company._7_1_Adapter._2_DuckAdapter.Objects.Turkey;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
