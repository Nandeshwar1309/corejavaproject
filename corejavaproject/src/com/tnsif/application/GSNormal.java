package com.tnsif.application;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;

public class GSNormal extends NormalAcc {
	public GSNormal(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}
	public void bookproduct(float charges) {
		System.out.println("dear normal account user . your product charges are :"+getCharges()+"delivery charges"+getDeliverycharges());
	}


}
