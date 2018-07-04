package com.san;

public class SavingAccount extends Account{

    @Override
    public void openAccount() {
        //super.openAccount();
        System.out.println("Saving Open Account");
    }

    @Override
    public void closeAccount() {
        //super.closeAccount();
        System.out.println("Saving Close Account");
    }

    @Override
    public int getCommitment() {
        return 0;
    }
}
