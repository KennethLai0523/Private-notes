public class Customer {

    // declare required attributes for this class.
    private String customerID;
    public String fullName;
    private double currentBalance;

    public Customer(String customerID, String fullname, double currentBalance) {
     //TODO: use the parameter in this contructor to set the class variable.
     String customerID;

        System.out.format("New customer created! \n Full name: %s, with ID: %s \n\n", this.fullName, this.customerID);
    }

    // TODO: Increment the current balance with parameter "amount"
    public void deposit(double amount) {
        double currentBalance;

        System.out.format("Deposit to %s, current balance is $%.2f \n\n", this.fullName, this.currentBalance);
    }

    // TODO: Decrement the current balance with parameter "amount"
    public void withdraw(double amount) {
        double currentBalance;

        System.out.format("Withdraw from %s, current balance is $%.2f \n\n", this.fullName, this.currentBalance);
    }

    // TODO: Decrement the current balance with the bill amount
    public void payBill(Bill bill) {
        double currentBalance;
        
        System.out.format("Payed bill current balance is $%.2f \n\n", this.currentBalance);
    }
}

=========================================================================================
public class Customer {

    // declare required attributes for this class.
    private String customerID;
    public String fullName;
    private double currentBalance;

    public Customer(String customerID, String fullname, double currentBalance) {
     //TODO: use the parameter in this contructor to set the class variable.
     this.customerID = customerID;
     this.fullName = fullName;
     this.currentBalance = currentBalance;

        System.out.format(
            "New customer created! \n Full name: %s, with ID: %s \n\n", 
            this.fullName, 
            this.customerID
        );
    }

    // TODO: Increment the current balance with parameter "amount"
    public void deposit(double amount) {
        this.currentBalance = this.currentBalance + amount;

        System.out.format(
            "Deposit to %s, current balance is $%.2f \n\n", 
            this.fullName, 
            this.currentBalance
            //fullName is public , this.currentBalance is localized 
        );
    }

    // TODO: Decrement the current balance with parameter "amount"
    public void withdraw(double amount) {
        this.currentBalance = this.currentBalance - amount ;

        System.out.format("Withdraw from %s, current balance is $%.2f \n\n", this.fullName, this.currentBalance);
    }

    // TODO: Decrement the current balance with the bill amount
    public void payBill(Bill bill) {
        this.currentBalance = this.currentBalance - bill;
        
        System.out.format("Payed bill current balance is $%.2f \n\n", this.currentBalance);
    }
}

//in Java after you go into a function -> dont need to store locally 