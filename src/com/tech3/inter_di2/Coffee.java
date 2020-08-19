package com.tech3.inter_di2;

public class Coffee {

	private Americano americano;
	
	
//	public Coffee(Americano ame) {//사용자생성자/외부에서 주입
//		americano=ame;
//
//	}
	public Coffee(Americano americano) {//다른 방식
		this.americano=americano;
		
	}
	
	
	public void coffeeType() {
		System.out.println(americano.getName());
	}
}
