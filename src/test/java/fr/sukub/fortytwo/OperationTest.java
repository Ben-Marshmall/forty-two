package fr.sukub.fortytwo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Test of operation 42 x *** ?= ****
 * @author Ben
 */
public class OperationTest {

    /**
     * To simplify the creation of an operation
     * @param permutation Figures[]
     * @return Operation
     */
    private Operation createOperation(Integer ... permutation) {
        return new Operation(Arrays.asList(permutation));
    }

    /**
     * Main test method
     */
    @Test
    public void test() {
        Operation operation = createOperation(1, 3, 5, 6, 7, 8, 9);
        assertEquals(135, operation.getOperand());
        assertEquals(6789, operation.getResult());
        assertEquals("42 x 135 != 6789", operation.toString());
    }

}