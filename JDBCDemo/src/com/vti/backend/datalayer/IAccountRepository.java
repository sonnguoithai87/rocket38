package com.vti.backend.datalayer;

import java.util.List;

import com.vti.entity.Account;

public interface IAccountRepository {
	public List<Account> getListAccount();
}
