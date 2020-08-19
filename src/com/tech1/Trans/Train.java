package com.tech1.Trans;

public class Train extends Trans{
	private int tDan;
	public Train(int cusCunt, int dis, int tDan) {
		super(cusCunt, dis);
		this.tDan=tDan;
	}
	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return cusCnt*dis*tDan;
	}
	

}
