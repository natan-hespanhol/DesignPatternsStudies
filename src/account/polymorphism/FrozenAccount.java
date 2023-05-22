package account.polymorphism;

public class FrozenAccount extends Account {

  public FrozenAccount(String iban, boolean overdraftAllowed) {
    super(iban,overdraftAllowed);
  }

  @Override
  public void withdrawAmount(double amount) throws Exception {
    throw new Exception("Failed. " + iban + " is frozen.");
  }
}
