class NotEnoughMoneyException extends Exception{
    @Override
    public String toString() {
        return "Not enough money for this operation";
    }
}
public class Task_3_Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Task_3_Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    void transaction(int money) {
        try {

            if (money > this.getBalance()) {
                throw new NotEnoughMoneyException();
            }
            this.setBalance(this.balance - money);
            System.out.println("Transaction has been completed.");
        }
        catch (NotEnoughMoneyException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Something happened");
        }
        finally {
            System.out.println("Your balance is " + this.getBalance());
        }

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
