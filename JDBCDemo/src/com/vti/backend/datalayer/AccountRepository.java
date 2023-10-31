package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Account;
import com.vti.utils.JDBCConnection;

public class AccountRepository implements IAccountRepository {

	@Override
	public List<Account> getListAccount() {
		try {
			Connection con = JDBCConnection.getInstance.getDBConnection();
			String sql = "select * from account";
			 PreparedStatement pstmt = con.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery();
			 List<Account> lstAccount = new ArrayList<Account>();
			 while (rs.next()) {
				int accountId = rs.getInt("AccountId");
				String userName = rs.getString("UserName");
				Account acc =  new Account(accountId, userName);
				lstAccount.add(acc);
				
			}
			 return lstAccount;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	

}
