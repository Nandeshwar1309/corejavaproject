package com.tnsif.framework1;

public abstract class CurrentAcc extends BankAcc {
private float creditLimit;
	
	public void withdrawl(float accBal) {
		
	}
	
	

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}



	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	public float creditLimit() {
		return creditLimit;
	}

	public void setcreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	


}
