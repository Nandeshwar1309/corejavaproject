package com.tnsif.application;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.Shopfactory;

public class GSShopFactory implements Shopfactory {
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc primeacc=new GSPrime(accNo,accNm,charges,isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewnormAccount(int accNo, String accNm, float charges, float deliverycharges) {
		NormalAcc normalacc=new GSNormal(accNo,accNm,charges,deliverycharges);
		return normalacc;
	}


}
