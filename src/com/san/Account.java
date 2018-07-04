package com.san;

public abstract class Account {

    private boolean Status;

    //common method
    public void openAccount(){
        System.out.println("Account Opened");

    }

    //common method
    public void closeAccount(){
        System.out.println("Account Closed");

    }

    public abstract int getCommitment();

}
