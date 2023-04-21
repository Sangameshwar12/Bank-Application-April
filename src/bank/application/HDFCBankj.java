package bank.application;

import java.util.UUID;

public class HDFCBankj  implements BankInterface{
    private int balance;
    private String accountNo;
    private String password;
    private String name;
    public static double rateOfInterest;

    public HDFCBankj(int balance, String password, String name) {
        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {
        if(password == this.password){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {

        balance += money;

        String message = money + " has been added to the account "+accountNo;
        return message;

    }

    @Override
    public String withDrawMoney(int money, String password) {
        if(password == this.password){
            if(money > balance){
                return "Insufficient balance";
            }
            else{
                balance -= money;
                return "Money withdrwan successfully.";
            }
        }
        return "Wrong password";

    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {

        // this
        if(this.password == oldPassword){
            this.password = newPassword;
            return "Passworde has been changed successfully";
        }
        return "Wrong password";
    }

    @Override
    public double calculateTotalInterest(int years) {

        double interse = balance * rateOfInterest*years/100;

        return interse;
    }
}
