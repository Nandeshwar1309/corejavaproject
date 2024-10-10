package com.tnsif.framework;

public interface Shopfactory {
	
	public PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isprime);
	public NormalAcc getNewnormAccount(int accNo,String accNm,float charges,float deliverycharges);

}
