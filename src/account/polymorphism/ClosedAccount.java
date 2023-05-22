package account.polymorphism;

public class ClosedAccount extends Account {

  public ClosedAccount(String iban, boolean overdraftAllowed) {
    super(iban,overdraftAllowed);
  }

  @Override
  public void withdrawAmount(double amount)throws Exception {
    throw new Exception("Failed. " + iban + " is closed.");
  }

}
