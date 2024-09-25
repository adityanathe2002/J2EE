package com.qsp.BMS.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.BMS.dao.AccountDao;
import com.qsp.BMS.dao.BankDao;
import com.qsp.BMS.dto.Account;
import com.qsp.BMS.dto.Bank;

public class BMSController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDao accountDao = new AccountDao();
		BankDao bankDao = new BankDao();

		do {
			System.out.println("1.Create Bank");
			System.out.println("2.update Bank");
			System.out.println("3.delete Bank");
			System.out.println("4.fetch Bank by id");
			System.out.println("5.fetch All Bank");
			System.out.println("6.Give Account to Bank");
			switch (sc.nextInt()) {
			case 1: {
				Bank bank = new Bank();
				System.out.println("enter Bank name");
				bank.setName(sc.next());
				sc.nextLine();
				System.out.println("enter Bank location");
				bank.setLocation(sc.nextLine());
				bankDao.saveBank(bank);
				System.out.println("created");
			}
				break;
			case 2: {
				System.out.println("enter id to update");
				Bank bank=bankDao.findBankById(sc.nextInt());
				sc.nextLine();
				System.out.println("enter new Location");
				bank.setLocation(sc.nextLine());
				bankDao.updateBank(bank);
				System.out.println("updated");
			}
				break;
			case 3: {
				System.out.println("enter id to delete");
				Bank bank=bankDao.findBankById(sc.nextInt());
				bankDao.deleteBank(bank);
				System.out.println("deleted");
			}
				break;
			case 4: {
				System.out.println("enter id");
				Bank bank=bankDao.findBankById(sc.nextInt());
				System.out.println(bank);
			}
				break;
			case 5: {
				List<Bank> banks=bankDao.getAllBanks();
				for (Bank bank : banks) {
					System.out.println(bank);
					System.out.println("---------------");
				}
			}
			case 6: {
				System.out.println("enter Bank id");
				Bank bank=bankDao.findBankById(sc.nextInt());
				Account account=new Account();
				System.out.println("enter Account name");
				account.setUserName(sc.next());
				System.out.println("enter phone number");
				account.setPhone(sc.nextLong());
				System.out.println("enter balance");
				account.setBalance(sc.nextDouble());
				//setting bank to account
				account.setBank(bank);
				List<Account> accounts=new ArrayList<Account>();
				accounts.add(account);
				//setting accounts to bank
				bank.setAccounts(accounts);
				bankDao.updateBank(bank);
				System.out.println("account added");
			}
				break;

			default:
				break;
			}
			System.out.println("enter y to continue");
		} while ("y".equalsIgnoreCase(sc.next()));
	}
}
