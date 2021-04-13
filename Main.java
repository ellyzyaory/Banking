package com.mycompany.bank;

import java.util.Scanner;

public class Main {
    private static Account acc = new Account(0);
    public static void choice() {
        int choice;
        double data;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Choose \n 1. get balance \n 2. deposit \n 3. withdraw \n 4. back \n 5. EXIT");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(acc.getBalance());
                    break;
                case 2:
                    System.out.println("The amount you want to be deposited: ");
                    data = scan.nextDouble();
                    acc.deposit(data);
                    break;
                case 3:
                    System.out.println("The amount you want to withdraw: ");
                    data = scan.nextDouble();
                    acc.withdraw(data);
                    break;
                case 4:
                    custom();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void custom() {
        String ask;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have an account?[y/n]: ");
        ask = scan.next();
        System.out.println("First Name: ");
        String f = scan.next();
        System.out.println("Last Name: ");
        String l = scan.next();
        Bank bank = new Bank("bca");
        Customer cust = new Customer(f, l);
        if(ask.equals("n")) {
            bank.addCustomer(cust.getFirstName(), cust.getLastName());
            choice();
        }
        else if (ask.equals("y")) {
            for(int i = 0; i < bank.getNumberOfCustomer(); i++) {
                if(bank.getCustomer(i).getFirstName().equals(f) && bank.getCustomer(i).getLastName().equals(l))
                    bank.getCustomer(i).setAccount(cust.getAccount());
            }
            choice();
        }
    }
    public static void main(String[] args) {
	// write your code here
        custom();
    }
}
