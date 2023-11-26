public class Task_2_Data {
    static void exceptionMethod(int x, int y){
        try{
            int[] testArray = new int[2];
            System.out.println("Start");
            System.out.println(x + "/" + y + "=" + (x / y));
            testArray[3] = y;
            System.out.println("Should be printed if exceptions don`t thrown");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("Final block");
        }
    }
}
