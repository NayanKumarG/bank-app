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
    public double fetchBalance(String password) {
        return 0;
    }

    @Override
    public String addMoney(double amount) {
        return null;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        return null;
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public double calculateInterest(int year) {
        return 0;
    }
}
