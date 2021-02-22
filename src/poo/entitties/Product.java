package poo.entitties;

public class Product {

    // Constante
    private static final double TAXA = 5.0;

    private String accountNumber; //Numero da conta
    private String holder; // Titular
    private double balance; // Saldo


    // Constructor with two parameters - Construtor com dois parametros
    Product(String accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    // Constructor with three parameters - Construtor com três parametros
    public Product(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    // get method to return the holder - metodo get para retornar o titular
    public String getHolder() {
        return  this.holder;
    }

    // set method to change the holder - metodo para alterar o titular
    public void setHolder(String holder) {
        this.holder = holder;
    }

    // get method to return the accountNumber - metodo get para retornar o numero da conta
    public String getAccountNumber(){
        return  this.accountNumber;
    }

    // set method to change the balance - metodo set para alterar o saldo
    public void setBalance(double valueDeposit){
        this.balance += valueDeposit;
    }

    // get method to return the deposit - metodo get para retornar o (saldo atual)
    public double getBalance() {
         return this.balance;
    }

    // method to withdraw - metodo para sacar
    public void withdraw(double withdrawlAmount) {
        this.balance = this.balance - withdrawlAmount - TAXA;
    }

    public String toString(){
        return  "Account: " + this.accountNumber +
                ", Holder: " + this.holder +
                ", Balance: $"+ this.balance;
    }
}
