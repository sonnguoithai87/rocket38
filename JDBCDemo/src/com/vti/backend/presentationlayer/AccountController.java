package com.vti.backend.presentationlayer;

import java.util.List;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.entity.Account;

public class AccountController {
	 public IAccountService accS = new AccountService();
     public  List<Account> getAllAccount() {
    	 return accS.getListAccount();
    	 
     }
}
