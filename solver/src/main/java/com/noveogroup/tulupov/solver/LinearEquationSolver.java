package com.noveogroup.tulupov.solver;

import com.noveogroup.tulupov.calculator.*;
import org.apache.commons.lang3.Validate;

/**
 * Linear equation solver.
 * ax = b
 */
public class LinearEquationSolver {
    private DecimalNumber a;
    private DecimalNumber b;

    public LinearEquationSolver(final DecimalNumber a, final DecimalNumber b) {
        Validate.notNull(a, "The first parameter cannot be null");
        Validate.notNull(b, "The second parameter cannot be null");
        Validate.isTrue(!a.equals(DecimalNumber.ZERO), "The first parameter cannot be zero");

        this.a = a;
        this.b = b;
    }

    public DecimalNumber solve() {
        return b.div(a);
    }
}
