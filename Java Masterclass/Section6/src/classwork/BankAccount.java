package classwork;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String custName;
    private String email;
    private String phoneNum;

    public void DepositFunds(double amount){
        this.balance += amount;
        System.out.println("Your current balance is R" + balance);
    }

    public void WithdrawFunds(double amount){
        if(balance >= amount){
            this.balance -= amount;
            System.out.println("Your current balance is R" + balance);
        }else{
            System.out.println("Insufficient funds");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
