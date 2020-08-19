package com.tech1.Trans;

public class TransTest {
	public static void printCharge(Trans tran) {
		System.out.println("================");
		System.out.println(tran.toString());//toString생략가능
		System.out.println("----------------");
		System.out.println("지불금액"+tran.getCharge());
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		Trans[] trans=new Trans[4];//배열처리
		trans[0]=new Train(5,100,200);
		trans[1]=new EXpress(10,100,200);
		trans[2]=new Taxi(2,10,500);
		trans[3]=new Train(1,100,200);
		//for each
		for (Trans tran : trans) {//trans를 tran으로 받음
			printCharge(tran);			
		}
		//for문
		for (int i = 0; i < trans.length; i++) {
			printCharge(trans[i]);
		}
		EXpress ex=new EXpress(1, 10, 500);
		System.out.println("출발지 : "+ex.getStartStation());
		System.out.println("도착지 : "+ex.getEndStation());
	}
}
