public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String PhoneNumber;
    private String Email;


//setting the constructor.
    public Account(String Number, double Balance, String Name, String PhoneNumber, String Email) {
        this.Number = Number;  //now we are initialisng the cosntructor with this
        this.Balance = Balance;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public void DepositMoney(double DepositedMoney) {
       this.Balance += DepositedMoney; //this.Balance = this.Balance+DepositedMoney
        System.out.println("Deposit is Successful, the balance is : "+"$"+this.Balance);
    }

    public void WithdrawMoney(double WithdrawlMoney) {
        if(this.Balance - WithdrawlMoney < 0){
            System.out.println("Withdraw Unsuccessful, Balance is low " + "$"+this.Balance );
        } else {
            this.Balance -= WithdrawlMoney;
            System.out.println("Withdraw Successful, Current balance is "+ "$"+this.Balance);

        }

    }


    public java.lang.String getNumber() {
        return Number;
    }

    public void setNumber(java.lang.String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public java.lang.String getName() {
        return Name;
    }

    public void setName(java.lang.String name) {
        Name = name;
    }

    public java.lang.String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(java.lang.String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public java.lang.String getEmail() {
        return Email;
    }

    public void setEmail(java.lang.String email) {
        Email = email;
    }
}
