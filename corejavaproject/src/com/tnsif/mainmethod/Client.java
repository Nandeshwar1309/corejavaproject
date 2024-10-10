package com.tnsif.mainmethod;

import com.tnsif.application.GSNormal;
import com.tnsif.application.GSPrime;
import com.tnsif.application.GSShopFactory;

public class Client {
	public static void main(String[] args) {
		GSShopFactory obj=new GSShopFactory();
		
		// prime account creation
		
		GSPrime ga=(GSPrime)obj.getNewPrimeAccount(12, "java", 500.6f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		
		GSNormal ge=(GSNormal)obj.getNewnormAccount(13, "spring", 500.6f, 65.4f);
		ge.bookproduct(ge.getCharges());
	}


}
