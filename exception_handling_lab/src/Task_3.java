public class Task_3 {
    public static void main(String[] args) throws NotEnoughMoneyException {
        Task_3_Account account1 = new Task_3_Account("Mike",1000,"M123321");
        account1.transaction(500);
        account1.transaction(1000);
    }
}
