package com.san;

public class CurrentAccount extends Account {
    @Override
    public void openAccount() {
        //super.openAccount();
        System.out.println("Current Open Account");
    }

    @Override
    public void closeAccount() {
        //super.closeAccount();
        System.out.println("Current Close Account");
    }

    @Override
    public int getCommitment() {
        return 0;
    }


}
