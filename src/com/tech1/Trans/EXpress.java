package com.tech1.Trans;

public class EXpress extends Trans implements Start,End{//���ջ��
	private int eDan;
	public EXpress(int cusCunt, int dis, int eDan) {//�������� �̸�=class�� �̸� Express
		super(cusCunt, dis);
		this.eDan=eDan;
	}
	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return cusCnt*dis*eDan;
	}
	@Override
	public String getStartStation() {
		// TODO Auto-generated method stub
		return "����";
	}
	@Override
	public String getEndStation() {
		// TODO Auto-generated method stub
		return "�λ�";
	}
}
