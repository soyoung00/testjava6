package com.tech3.inter_di;

public class Coffee {
//	private HotAmericano ame;//�־Ƹ޸�ī��
	private IceAmericano ame;//���̽��Ƹ޸�ī��
	public Coffee() {//Ŀ���� �⺻������
//		System.out.println("���� ȣ���ؾ�");
//		ame=new HotAmericano();//��
		ame=new IceAmericano();//���̽�
//		System.out.println(ame);
	}
	public void coffeeType() {
		System.out.println(ame.getName());
	}
}
