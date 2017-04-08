import Exceptions.DivideByZeroException;

import java.math.BigInteger;

/**
 * Created by Mauk on 4/8/2017.
 */
public class Operands {

    public static double multiplication(double x1, double x2) {
        return x1 * x2;
    }

    public static double division(double x1, double x2) throws DivideByZeroException {
        if (x2 == 0) {
            throw new DivideByZeroException();
        }
        return x1 / x2;
    }

    public static double addition(double x1, double x2) {
        return x1 + x2;
    }

    public static double subtraction(double x1, double x2) {
        return x1 - x2;
    }

}
