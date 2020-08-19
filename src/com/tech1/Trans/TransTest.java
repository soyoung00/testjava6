package com.tech1.Trans;

public class TransTest {
	public static void printCharge(Trans tran) {
		System.out.println("================");
		System.out.println(tran.toString());//toString��������
		System.out.println("----------------");
		System.out.println("���ұݾ�"+tran.getCharge());
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		Trans[] trans=new Trans[4];//�迭ó��
		trans[0]=new Train(5,100,200);
		trans[1]=new EXpress(10,100,200);
		trans[2]=new Taxi(2,10,500);
		trans[3]=new Train(1,100,200);
		//for each
		for (Trans tran : trans) {//trans�� tran���� ����
			printCharge(tran);			
		}
		//for��
		for (int i = 0; i < trans.length; i++) {
			printCharge(trans[i]);
		}
		EXpress ex=new EXpress(1, 10, 500);
		System.out.println("����� : "+ex.getStartStation());
		System.out.println("������ : "+ex.getEndStation());
	}
}
