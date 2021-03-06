package com.solidprinciples;




/*
 * Single Class need to have one and only reason to change.
 * 
 *  In Soild,
 *			 S Stands for SingleResponsibilityPrinciple
 */



public class SingleResponsibilityPrinciple {
	
	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		accountService.openAccount();

	}

}


class AccountService
{
	
	AccountRepository accountRepo = new AccountRepository();
	NotificationService notificationService = new NotificationService();
	
	void openAccount()
	{
		System.out.println("fill the account internal details");
		accountRepo.create();
		notificationService.sentnotify();
	}
}

class AccountRepository
{
	void create() {
	System.out.println("store details of account");
	
	}
	}

class NotificationService{
	void sentnotify() {
		System.out.println("Welcome to account and account has opened");
	}
}

