package com.tech1.Trans;

public class Taxi extends Trans{
	private int xDan;
	public Taxi(int cusCunt, int dis, int xDan) {
		super(cusCunt, dis);
		this.xDan=xDan;
	}
	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return cusCnt*dis*xDan;
	}
}
