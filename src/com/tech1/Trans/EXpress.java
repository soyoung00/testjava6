package com.tech1.Trans;

public class EXpress extends Trans implements Start,End{//복합상속
	private int eDan;
	public EXpress(int cusCunt, int dis, int eDan) {//생성자의 이름=class의 이름 Express
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
		return "서울";
	}
	@Override
	public String getEndStation() {
		// TODO Auto-generated method stub
		return "부산";
	}
}
