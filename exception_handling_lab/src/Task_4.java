public class Task_4 {
    public static void main(String[] args) {
        try {
            int x = 1;
            String y = "str";
            Double z = 2.0;
            int[] p = {1, 2};

//            Task_4_Data.checkType(x);
//            Task_4_Data.checkType(y);
//            Task_4_Data.checkType(z);
            Task_4_Data.checkType(p);
        } catch (IntTypeException | StringTypeException | DoubleTypeException | AnotherTypeException e) {
            System.out.println(e);
        }

    }
}
