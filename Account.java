package com.quixindo.projects.bank;

public class Account
{
    public int id;
    public String owner;
    public double balance;
    public String type;
    public boolean status;
    public double initBalance;

    Account(String type, double initBalance){
        this.initBalance = initBalance;
        if (initBalance > 0) {
            this.openAccount(type);
        }
    }

    void openAccount(String type){
        this.type = type;
        this.status = true;
        System.out.println("Conta "+type+" Criada Com Sucesso");
    }

    void closeAccount(){
        this.status = false;
        System.out.println("Building");
    }

    void printType(){
        System.out.println(this.type);
    }

    void monthlyPay()
    {
        System.out.println("This account is from Standard Bank");
    }

    void get(double quantity)
    {
        double newBalance = this.balance - quantity;
        this.balance = newBalance;
    }

    void deposit(double quantity)
    {
        this.balance += quantity;
    }
}