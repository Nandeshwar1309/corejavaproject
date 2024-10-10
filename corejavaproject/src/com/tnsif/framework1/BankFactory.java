package com.tnsif.framework1;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalaried);
	public CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit);


}
