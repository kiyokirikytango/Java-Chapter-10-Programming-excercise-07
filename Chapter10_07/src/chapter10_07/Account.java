
package chapter10_07;


public class Account {
    
    
    private int id;                                             //holds the value of id and balance
    private double balance;

    public Account(int id, double balance) {
       
        this.id = id;                                    // constructor that sets the specific value of id and balance
        this.balance = balance;
    }

    public int getId() {                                            //getter method for ID,reads the value
        return this.id;
    }

    public double getBalance() {                                    //getter method for blance,reads the value
        return this.balance;
    }


    public void setId(int id) {                                  //setter method for ID, method that updates value of a variable
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;                                          //setter method for balance, method that updates value of a variable
    }

 
    public void withdraw(double amount) {                               //calculation for withdraw
        this.balance -= amount;
    }

    public void deposit(double amount) {                                        //calculation for deposit
        this.balance += amount;
    }
}
