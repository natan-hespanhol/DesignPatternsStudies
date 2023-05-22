package account.polymorphism;

public class Bank {

  public static void main(String[] args)throws Exception{
    Account myAccount = new OpenAccount("123456", false);
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

    System.out.println("---------------------------------------------------------------------------");

    Account initialClosedAccount = new ClosedAccount("123456", false);
  }
}
