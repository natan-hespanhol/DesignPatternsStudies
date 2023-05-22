package account.polymorphism;


import account.SimpleAccount.AccountState;

public abstract class Account {

  protected String iban; //International Bank Account Number, an id for the account
  protected AccountState state;
  protected double currentBalance = 0.0;
  protected boolean overdraftAllowed = false;
//  private boolean overdraftAllowed = false; //example if this would be private instead of protected

  public Account(String iban, boolean overdraftAllowed){
    this.iban = iban;
    this.overdraftAllowed = overdraftAllowed;
  }

  public String getIban() { return iban; }
  public AccountState GetState() { return state; }
  public double getCurrentBalance() { return currentBalance; }
  public void setCurrentBalance(double balance) { currentBalance = balance; }
  public boolean isOverdraftAllowed() { return overdraftAllowed; }
  public void setOverdraftAllowed(boolean overdraftAllowed) { this.overdraftAllowed = overdraftAllowed; }

  public abstract void withdrawAmount(double amount) throws Exception;

}

