import java.io.IOException;

public class Task_5 {

    public static void main(String[] args) {
        try {
            Task_5_LoggerExceptionCaller.throwLoggingException1();
        }
        catch (LoggerException1 | LoggerException2 | IOException e) {
            System.out.println(e);
        }
        try {
            Task_5_LoggerExceptionCaller.throwLoggingException2();
        } catch (LoggerException2 | IOException e) {
            System.out.println(e);
        }
    }
}
