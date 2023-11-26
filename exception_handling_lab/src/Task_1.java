public class Task_1 {
    public static void main(String[] args) {
        try {
            Task_1_Data.createNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
            e.toString();
            e.printStackTrace();

        }
    }
}