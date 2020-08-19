package com.tech3.inter_di2;

public class CoffeeTest {
	public static void main(String[] args) {
//		Coffee coffee=new Coffee();//目乔狼 积己磊 龋免
		HotAmericano hot=new HotAmericano();//按眉积己
		IceAmericano ice=new IceAmericano();
		Coffee coffee=new Coffee(hot);
		
		coffee.coffeeType();
	}
}
