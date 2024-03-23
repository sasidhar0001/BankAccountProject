//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account TestAccount = new Account("03213345",0.0,"John Wick","+19784502340","john.wick@gmail.com");

                TestAccount.DepositMoney(1000);
                 TestAccount.DepositMoney(2000);
                 TestAccount.WithdrawMoney(2000);
    }
}