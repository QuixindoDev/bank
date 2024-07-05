package com.quixindo.projects.bank;

public class Account
{
    public int id;
    private String owner;
    private double balance;
    protected char type;
    private boolean status;

    Account(){
        this.setStatus(false);
        this.setBalance(0);
    }

    public void openAccount(char type, String name){
        setOwner(name);
        setType(type);
        setStatus(true);

        if (this.type == 'c') setBalance(getBalance() + 50.00);
        else setBalance(getBalance() + 150.00);

        System.out.println("Welcome Sr. "+getOwner());
        System.out.println("Account built successful");
    }

    public void closeAccount(){
        if (this.balance > 0){
            this.getMoney(this.balance);
            this.status = false;
            System.out.println("Account closed successfully!!");
        }
        else System.out.println("You can not do this operation!!");
    }

    public void getMoney(double quantity){
        if (getStatus() && getBalance() >= quantity) setBalance(getBalance() - quantity);
        System.out.println("Your balance is not enough");
    }

    public void deposit(double quantity){
        if (getStatus()) setBalance(getBalance() + quantity);
        System.out.println("Your account does not exist");
    }

    public void payMonthly(char type) {
        double paymantV;
        if (type == 'c')
            paymantV = 12.00;
        else
            paymantV = 20.00;

        if (getStatus() && getBalance() >= paymantV){
            setBalance(getBalance() - paymantV);
            System.out.println("Your account has been debited " + paymantV + "$ regarding monthly payment.");
        }
        else
            System.out.println("Insufficience balance to pay the monthly fee.");
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return this.type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }
}