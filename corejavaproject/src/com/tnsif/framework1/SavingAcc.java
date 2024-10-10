package com.tnsif.framework1;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float minBal=0;
	
	
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public static float getDeliverycharge() {
		return minBal;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdrawal(float accBal) {
		
	}


	
	
	

}
