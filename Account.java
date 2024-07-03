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

        if (this.type == "Saving") this.balance += 150.00;
        else this.balance += 50.00;

        System.out.println("Welcome Sr. "+this.owner);
        System.out.println(type+" account built successful");
    }

    void closeAccount(){
        if (this.balance > 0){
            this.get(this.balance);
            this.status = false;
        }
        else System.out.println("You can not do this operation!!");

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