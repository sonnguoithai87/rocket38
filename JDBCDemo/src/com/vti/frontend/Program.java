package com.vti.frontend;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;
import com.vti.utils.JDBCConnection;
import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		menu();
		//choice
		int choice  = 0;
		AccountController acctl = new AccountController();
		 while (true) {
			 System.out.println("Mời nhập lựa chọn: ");
			 choice = ScannerUtils.inputInt();
			 switch (choice) {
			case 1:
				List<Account> lst = acctl.getAllAccount();
				for (Account ac: lst) {
					System.out.println(ac.toString());
				}
				break;

			default:
				break;
			}
			 
		 }
		
	}
    public static void menu() {
    	 System.out.println("Menu");
    	 System.out.println("1. Get List Account");
    	
    }
	
}
