package com.quixindo.projects.bank;

public class App {
    public static void main(String[] args) {
        Account jubileu = new Account();
        jubileu.openAccount('p', "Jubileu");
        jubileu.deposit(50);
        jubileu.getMoney(50);

        System.out.println(jubileu.getBalance());
    }
}
