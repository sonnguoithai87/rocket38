package com.vti.backend.businesslayer;

import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entity.Account;

public class AccountService implements IAccountService{
	
	public  IAccountRepository acrp = new AccountRepository();
	@Override
	public  List<Account> getListAccount() {
		try {
			//int percent  = 5/0;
			return acrp.getListAccount();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	    
	}
	

}
