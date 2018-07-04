package com.san;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Account[] accounts = new Account[3];

        accounts[0] = new SavingAccount();
        accounts[1] = new CurrentAccount();
        accounts[2] = new FixedAccount();

        for(Account account: accounts){
            //when the turn of FixedAcccount comes, it will take care of terms too
            System.out.println(account.getCommitment());
        }

    }
}
