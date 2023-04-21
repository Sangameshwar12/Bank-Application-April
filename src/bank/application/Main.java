package bank.application;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HDFCBankj.rateOfInterest = 6;
        SBI account1 = new SBI(100000, "123", "Dev");

        SBI account2 = new SBI(150000,"456", "Rakshit");

        HDFCBankj account3 = new HDFCBankj(150000,"789","Mehran");

        int balance = account1.checkBalance("124");
        System.out.println("Account balance is "+balance);

        int balanceCheck = account1.checkBalance("123");
        System.out.println("Account balance is "+balanceCheck);

        String bankMesssage = account2.addMoney(40000);
        System.out.println(bankMesssage);

        String bankmsg = account3.withDrawMoney(30000, "789");
        System.out.println(bankmsg);


        double interset = account1.calculateTotalInterest(20);
        System.out.println("Total interset you will get is "+interset);

        double interest1 = account2.calculateTotalInterest(20);
        System.out.println("Total interest you will get is "+interest1);





    }
}