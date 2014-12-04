package com.noveogroup.tulupov.solver;

import com.noveogroup.tulupov.calculator.DecimalNumber;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Linear equation solver test.
 * ax = b
 */
@SuppressWarnings("unused")
public class LinearEquationSolverTest {
    @Test
    public void simpleTest() {
        final DecimalNumber a = new DecimalNumber(1);
        final DecimalNumber b = new DecimalNumber(2);
        final DecimalNumber x = new DecimalNumber(2);
        final LinearEquationSolver solver = new LinearEquationSolver(a, b);

        assertEquals(solver.solve(), x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalEquationTest() {
        final DecimalNumber a = new DecimalNumber(0);
        final DecimalNumber b = new DecimalNumber(2);
        final LinearEquationSolver solver = new LinearEquationSolver(a, b);
    }

    @Test(expected = NullPointerException.class)
    public void illegalArgsTest() {
        final LinearEquationSolver solver = new LinearEquationSolver(null, null);
    }
}
