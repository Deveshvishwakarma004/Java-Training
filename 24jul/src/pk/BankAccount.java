package pk;

public class BankAccount 
{
  private int actNo;
  private float balance;
  
  public BankAccount(int actNo , float balance) {
	  this.actNo = actNo;
	  this.balance = balance;
  }
  
  // Synchronized keyword is used to make the method synchronized so that only one thread can use
  // the method at a time.
  
  public synchronized void deposit(float amt)   
{
   float bal = this.balance;
   this.balance += amt;
   
   System.out.println(amt + " Depostited done  , Old : " + bal + "Balance : " + this.balance);
}
  
  public synchronized void withdraw(float amt) {
	  float bal = this.balance;
	  if(this.balance >= amt) {
		  this.balance -=amt;
		  System.out.println(amt + " Withdraw Done , Old : " + bal + "Balance : "+ this.balance);
	  }
	  else {
		  System.out.println(amt + " Withdraw Failed , Balance : " + this.balance);
	  }
  }
}
