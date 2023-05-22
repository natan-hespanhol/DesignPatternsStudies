package account.polymorphism;

public class OpenAccount extends Account {

  public OpenAccount(String iban, boolean overdraftAllowed) {
    super(iban, overdraftAllowed);
  }

  @Override
  public void withdrawAmount(double amount) throws Exception {
    if (amount > currentBalance && !overdraftAllowed)
      throw new Exception("Overdraft not allowed.");

    currentBalance -= amount;
  }
}
