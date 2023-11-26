class IntTypeException extends Exception {
    @Override
    public String toString() {
        return "Value Type Int";
    }
}

class DoubleTypeException extends Exception {
    @Override
    public String toString() {
        return "Value Type Double";
    }
}

class StringTypeException extends Exception {
    @Override
    public String toString() {
        return "Value Type String";
    }
}

class AnotherTypeException extends Exception {
    @Override
    public String toString() {
        return "Its not Int,Double or String";
    }
}

public class Task_4_Data {
    static void checkType(Object... args) throws IntTypeException, DoubleTypeException, StringTypeException, AnotherTypeException {
        for (Object arg : args) {
            if (arg instanceof Integer) {
                throw new IntTypeException();
            } else if (arg instanceof Double) {
                throw new DoubleTypeException();
            } else if (arg instanceof String) {
                throw new StringTypeException();
            } else{
                throw new AnotherTypeException();
            }
        }
    }
}
