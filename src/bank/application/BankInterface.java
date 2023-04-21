package bank.application;

public interface BankInterface {


    // does not contain variables

    public int checkBalance(String password);

    public String addMoney(int money);

    public String withDrawMoney(int money, String password);

    public String changePassword(String oldPassword, String newPassword);

    public double calculateTotalInterest(int years);

    /*

        Transfer Money
        within the same bank

    */


}
