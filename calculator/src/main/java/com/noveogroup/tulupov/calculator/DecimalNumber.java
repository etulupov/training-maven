package com.noveogroup.tulupov.calculator;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Represents decimal number.
 */
@AllArgsConstructor
@EqualsAndHashCode
@SuppressWarnings("unused")
public class DecimalNumber {
    /**
     * Contains zero number.
     */
    public static final DecimalNumber ZERO = new DecimalNumber(0);

    /**
     * Represents the value.
     */
    @Getter
    private double value;

    /**
     * Returns this + second.
     *
     * @param second the second argument
     * @return the sum of this and the second argument
     */
    public DecimalNumber add(final DecimalNumber second) {
        return add(this, second);
    }

    /**
     * Returns this - second.
     *
     * @param second the second argument
     * @return the difference of this and the second argument
     */
    public DecimalNumber sub(final DecimalNumber second) {
        return sub(this, second);
    }

    /**
     * Returns this * second.
     *
     * @param second the second argument
     * @return the product of this and the second argument
     */
    public DecimalNumber mul(final DecimalNumber second) {
        return mul(this, second);
    }

    /**
     * Returns this / second.
     *
     * @param second the second argument
     * @return the quotient of this and the second argument
     */
    public DecimalNumber div(final DecimalNumber second) {
        return div(this, second);
    }

    /**
     * Returns first + second.
     *
     * @param first  the first argument
     * @param second the second argument
     * @return the sum of the first and the second arguments
     */
    public static DecimalNumber add(final DecimalNumber first, final DecimalNumber second) {
        return new DecimalNumber(first.getValue() + second.getValue());
    }

    /**
     * Returns first - second.
     *
     * @param first  the first argument
     * @param second the second argument
     * @return the difference of the first and the second arguments
     */
    public static DecimalNumber sub(final DecimalNumber first, final DecimalNumber second) {
        return new DecimalNumber(first.getValue() - second.getValue());
    }

    /**
     * Returns first * second.
     *
     * @param first  the first argument
     * @param second the second argument
     * @return the product of the first and the second arguments
     */
    public static DecimalNumber mul(final DecimalNumber first, final DecimalNumber second) {
        return new DecimalNumber(first.getValue() * second.getValue());
    }

    /**
     * Returns first / second.
     *
     * @param first  the first argument
     * @param second the second argument
     * @return the quotient of the first and the second arguments
     */
    public static DecimalNumber div(final DecimalNumber first, final DecimalNumber second) {
        return new DecimalNumber(first.getValue() / second.getValue());
    }

    /**
     * Returns string representation.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return Double.toString(value);
    }
}
