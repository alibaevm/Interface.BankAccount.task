import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println(bankAccount.checkBalance());
        bankAccount.deposit(2000);
        bankAccount.deposit(700);
        bankAccount.withdraw(100);
        System.out.println("Current balance : "+ bankAccount.checkBalance());
        System.out.println(bankAccount.displayTransactionHistory());

//        while (true) {
//            System.out.println("""
//                    1.Deposit
//                    2.Check Balance
//                    3.Withdrawal
//                    4.Transactional History
//                    choice command :
//                               """);
//
//            switch (scanner.nextLine().toLowerCase()){
//                case "1" -> {
//
//
//                }
//            }
//        }



    }
}