import java.util.UUID;

public class HDFCAccount implements BankAccountInf{

    private String name;
    private String accountNo;
    private String password;
    private double balance;
    final double rateOfInterest = 7.1;
    final String ifscCode = "HDFC0004123";

    public HDFCAccount() {
    }

    public HDFCAccount(String name, String accountNo, String password, double balance) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals((password)))
            return "Your balacnce is: "+this.balance;
        return "Incorrect passoword";
    }

    @Override
    public String addMoney(double amount) {
        this.balance +=amount;
        return "Amount is added successfully: New balance is:"+this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals((password)))
        {
            if(this.balance<amount)
            {
                return "Insufficient balance: Current balance:"+this.balance;
            }
            else {
                this.balance-=amount;
                return "Amount deducted successfully: New balance:"+this.balance;
            }
        }
        return "Incorrect password:";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals((oldPassword)))
        {
            this.password = newPassword;
            return "Password update successfull:";
        }
        return "Wrong old password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*year*this.rateOfInterest)/10;
    }
}
