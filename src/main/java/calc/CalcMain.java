package calc;

/**
 * Main class of the application.
 *
 * It implements the Calculator interface.
 * The two calculation methods must use the stack provided in the constructor.
 *
 * Additionally, it provides 2 methods to obtain instances of the two
 * different stack implementations.
 *
 */
public class CalcMain implements Calculator {

    /**
     * Constructor for the calculator.
     * @param stack an instance of a stack that implements the interface {@code GenericStack}
     */
    public CalcMain(GenericStack<Double> stack) {
        //TODO
    }

    /** {@inheritDoc} */
    @Override
    public double calcInfix(String[] s) throws CalcException {
        return 0; //TODO
    }

    /** {@inheritDoc} */
    @Override
    public double calcPostfix(String[] s) throws CalcException {
        return 0; //TODO
    }

    /**
     * Creates and returns a new instance of an array-based stack with limited
     * capacity. The stack must not change the capacity.
     *
     * @param capacity the capacity of the stack (i.e., maximum number of elements
     *                 to be stored in the stack)
     * @return an instance of the array-based stack with the given capacity
     */
    public static GenericStack<Double> getArrayStack(int capacity) {
        return null; //TODO
    }

    /**
     * Creates and returns a new instance of a list-based stack with unbound
     * capacity.
     *
     * @return an instance of a list-based stack (with unbound capacity)
     */
    public static GenericStack<Double> getListStack() {
        return null; //TODO
    }

}
