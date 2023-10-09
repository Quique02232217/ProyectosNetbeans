package com.mycompany.bancorepublica;

public class Account {

    private String accountHolder;
    private double accountMoney;
    protected int ageHolder;
    public Account() {
    }

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;

    }

    private Account(String accountHolder, double accountMoney) {
        this.accountHolder = accountHolder;
        this.accountMoney = accountMoney;

    }

    public static Account infoAccount(String holder, double money) {
        return new Account(holder, money);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    @Override
    public String toString() {
        return "Nombre del titular: " + accountHolder + " Cantidad: " + accountMoney;
    }

    public int getAgeHolder() {
        return ageHolder;
    }

    public void setAgeHolder(int ageHolder) {
        this.ageHolder = ageHolder;
    }


    

    
    
    
    public double addQuantity(double addMoney, double moneyAccountOfHolder) {
        return moneyAccountOfHolder + addMoney;
    }

    public double subtractQuantity(double subtractMoney, double moneyAccountOfHolder) {
        return moneyAccountOfHolder - subtractMoney;
    }

}
