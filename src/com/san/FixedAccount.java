package com.san;

public class FixedAccount extends  Account{

    //here, the terms class is associated with FixedAccount
    class Terms {
        int year ;

        public Terms(int year){
            this.year = year;
        }
    }

    Terms terms;

    public FixedAccount(){
        this.terms = new Terms(2);
    }

    public int getCommitment(){
        //System.out.println("The number of commitment for this account = " + this.terms.year);
        return this.terms.year;
    }


}
