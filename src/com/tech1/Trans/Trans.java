package com.tech1.Trans;

public abstract class Trans {
	protected int cusCnt;//인원//같은패키지안에있는 (다른)클래스에서는 사용 가능=protected/접근지정자!
	protected int dis;//이동거리
	
	public Trans(int cusCunt, int dis) {//constructor=생성자
		this.cusCnt=cusCunt;
		this.dis=dis;//4~5번줄에 전달
	}
	
	public abstract int getCharge();//추상메소드생성

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cusCnt+":"+dis;
	}
}
