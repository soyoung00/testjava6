package com.tech1.Trans;

public abstract class Trans {
	protected int cusCnt;//�ο�//������Ű���ȿ��ִ� (�ٸ�)Ŭ���������� ��� ����=protected/����������!
	protected int dis;//�̵��Ÿ�
	
	public Trans(int cusCunt, int dis) {//constructor=������
		this.cusCnt=cusCunt;
		this.dis=dis;//4~5���ٿ� ����
	}
	
	public abstract int getCharge();//�߻�޼ҵ����

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cusCnt+":"+dis;
	}
}
