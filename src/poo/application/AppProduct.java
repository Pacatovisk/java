package poo.application;

import poo.entitties.Product;

import java.util.Locale;
import java.util.Scanner;

public class AppProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is initial deposit value (y/n)? ");
        char isInitialDeposit = sc.nextLine().charAt(0);

        System.out.println();
        if (isInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double isInitialDepositValue = sc.nextDouble();
            Product product = new Product(accountNumber,holder, isInitialDepositValue);

            System.out.println("Account data: ");
            System.out.println(product.toString());
            System.out.print("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            product.setBalance(depositValue);

            System.out.println();
            System.out.println("Updated account data: ");
            System.out.println(product.toString());

            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            product.withdraw(withdraw);
            System.out.println("Update account data: ");
            System.out.println(product.toString());

        }

        sc.close();

    }
}
