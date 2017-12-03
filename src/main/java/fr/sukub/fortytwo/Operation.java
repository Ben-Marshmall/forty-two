package fr.sukub.fortytwo;

import java.util.List;

/**
 * Operation 42 x *** ?= ****
 * @author Ben
 */
public class Operation {
    private int operand;
    private int result;

    /**
     * Construct the operation : 42 x *** ?= ****
     * @param permutation List of figures from a permutation
     */
    public Operation(List<Integer> permutation) {
        operand = permutation.get(0) * 100 + permutation.get(1) * 10 + permutation.get(2);
        result = permutation.get(3) * 1000 + permutation.get(4) * 100 + permutation.get(5) * 10 + permutation.get(6);
    }

    /**
     *
     * @return Operand
     */
    public int getOperand() {
        return operand;
    }

    /**
     *
     * @return Expected result
     */
    public int getResult() {
        return result;
    }

    /**
     * Check the equality
     * @return 42 x operand == result
     */
    public boolean check() {
        return 42 * operand == result;
    }

    @Override
    public String toString() {
        StringBuilder buffy = new StringBuilder("42 x ");
        buffy.append(operand);
        buffy.append(check() ? " = " : " != ");
        buffy.append(result);
        return buffy.toString();
    }
}
