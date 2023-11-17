import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class BankAccount implements Deposit, TransactionalHistory, Account, WithDrawal {
    private  double balance ;
    private String TransactionHistory;

    public BankAccount() {
        this.balance = 0;
        TransactionHistory = "";
    }

    @Override
    public String checkBalance() {
        return "Current balance : $" + this.balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            addTransactionHistory("Deposit : $" + amount+" date : "+LocalDateTime.now());


        } else System.out.println("Deposit failed !");
    }

        @Override
    public String displayTransactionHistory() {
        return this.TransactionHistory;
    }

    @Override
    public double withdraw(double amount){
            if (amount <= balance && amount > 0) {
                this.balance -= amount;
                addTransactionHistory("Deposit : $"+ amount +"date : "+ LocalDateTime.now());
                return amount;
            } else {
                System.err.println("Withdraw failed!");
            }
            return 0;
        }
        private  void addTransactionHistory(String transaction){
        TransactionHistory += "\n"+ transaction;
        }



}











