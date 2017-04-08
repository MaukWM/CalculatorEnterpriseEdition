import Exceptions.DivideByZeroException;

public class Main {

    public static void main(String[] args) throws DivideByZeroException {
        System.out.println(Operands.division(10,5));
        System.out.println(Operands.multiplication(10,10));
        System.out.println(Operands.addition(5,5));
        System.out.println(Operands.subtraction(4,3));
    }
}
