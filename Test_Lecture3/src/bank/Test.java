package bank;

public class Test {

    public static void main(String[] args) {

        Account myAccount = new Account(1122, 20000);

        myAccount.setAnnualInterestRate(4.5);

        myAccount.withdraw(2500);

        myAccount.deposit(3000);

        System.out.println("Balance: " + myAccount.getBalance() + " , Monthly interest: " + myAccount.getMonthlyInterest() + " , Created: " + myAccount.getDateCreated());

    }

}
