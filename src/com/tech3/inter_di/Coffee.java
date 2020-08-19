package com.tech3.inter_di;

public class Coffee {
//	private HotAmericano ame;//핫아메리카노
	private IceAmericano ame;//아이스아메리카노
	public Coffee() {//커피의 기본생성자
//		System.out.println("나를 호출해쓰");
//		ame=new HotAmericano();//핫
		ame=new IceAmericano();//아이스
//		System.out.println(ame);
	}
	public void coffeeType() {
		System.out.println(ame.getName());
	}
}
