package account;

public class SimpleAccount {

  private String iban; //International Bank Account Number, an id for the account
  private AccountState state;
  private double currentBalance = 0.0;
  private boolean overdraftAllowed = false;

  public SimpleAccount(String iban) {
    iban = iban;
    state = AccountState.Open;
  }
  public String getIban() { return iban; }
  public AccountState GetState() { return state; }
  public double getCurrentBalance() { return currentBalance; }
  public void setCurrentBalance(double balance) { currentBalance = balance; }
  public boolean isOverdraftAllowed() { return overdraftAllowed; }
  public void setOverdraftAllowed(boolean overdraftAllowed) { this.overdraftAllowed = overdraftAllowed; }

  public void withdrawAmount(double amount)throws Exception {
    if (state.equals(AccountState.Open)) {
      if (amount > currentBalance) {
        if (overdraftAllowed) {
          currentBalance -= amount;
        } else {
          throw new Exception("Overdraft not allowed");
        }
      } else {
        currentBalance -= amount;
      }
    } else if (state.equals(AccountState.Closed)) {
      throw new Exception("Failed. " + iban + " is closed.");
    } else if (state.equals(AccountState.Frozen)) {
      throw new Exception("Failed. " + iban + " is frozen.");
    }
  }

  public enum AccountState {
    Open,
    Closed,
    Frozen,
  }

  public static void main(String[] args)throws Exception{
    SimpleAccount myAccount = new SimpleAccount("123456");
    myAccount.setCurrentBalance(100.00);
    System.out.println("Balance: "+myAccount.getCurrentBalance()); //I have $ 100.00

    try { //let's try to withdraw $101
      myAccount.withdrawAmount(50.00); // withdrawing $50 bucks
      myAccount.withdrawAmount(51.00); // withdrawing $51 bucks, can I? I don't think so
    }
    catch(Exception e){
      System.out.println("Oh no, I can't take $101."); //I could use System.err if I want to emphasize the error
    }

    System.out.println("Balance: "+myAccount.getCurrentBalance()); //oh, I still have $50, right?

    myAccount.setOverdraftAllowed(true); //now I can take more than I have in balance
    myAccount.withdrawAmount(51.00); //yeaah

    System.out.println("Balance: "+myAccount.getCurrentBalance()); //I need to pay this at some moment
  }
}


