package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        char initialDeposit;
        do {
            System.out.print("Is there a initial deposit (y/n)? ");
            initialDeposit = sc.next().charAt(0);
        } while (initialDeposit != 'y' && initialDeposit != 'n');

        Account account;
        double amount;

        if (initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            amount = sc.nextDouble();
            account = new Account(number, holder, amount);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account data: " + account);

        System.out.print("Enter a deposit value: ");
        amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Updated account data: " + account);

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("Updates account data: " + account);

        sc.close();
    }
}
