import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;
import java.util.logging.FileHandler;


class LoggerException1 extends Exception {
    private static final Logger logger1 = Logger.getLogger("LoggingException1");

    public LoggerException1() throws IOException {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger1.severe(trace.toString());
    }
}

class LoggerException2 extends Exception {
    private static final Logger logger2 = Logger.getLogger("LoggingException2");
    public LoggerException2() throws IOException {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger2.severe(trace.toString());
    }
}

public class Task_5_LoggerExceptionCaller {
    private static final Logger logger1 = Logger.getLogger("LoggingException1");
    private static final Logger logger2 = Logger.getLogger("LoggingException2");

    static {
        try {
            FileHandler fileHandler = new FileHandler("logfile.txt",true);
            logger1.addHandler(fileHandler);
            logger2.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void throwLoggingException1() throws LoggerException1, LoggerException2, IOException {
        throw new LoggerException1();
    }

    public static void throwLoggingException2() throws LoggerException2, IOException {
        throw new LoggerException2();
    }
}
