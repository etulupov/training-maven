package com.noveogroup.tulupov.solver;

import com.noveogroup.tulupov.calculator.DecimalNumber;
import org.apache.commons.cli.*;

import java.io.PrintStream;

/**
 * Launch app.
 */
public class Launcher {
    private static final String ARGS_A = "a";
    private static final String ARGS_B = "b";
    private static final String DEFAULT_VALUE = "1";

    private PrintStream out;

    public Launcher(final PrintStream out) {
        this.out = out;
    }

    public void run(final String[] args) {
        final Options options = new Options();
        options.addOption(ARGS_A, true, "a argument");
        options.addOption(ARGS_B, true, "b argument");

        final CommandLineParser parser = new BasicParser();
        CommandLine commandLine = null;
        try {
            commandLine = parser.parse(options, args);
        } catch (ParseException e) {
            out.println("Parsing failed. Reason: " + e.getMessage());
        }

        if (commandLine != null) {
            final DecimalNumber a = new DecimalNumber(
                    Double.valueOf(commandLine.getOptionValue(ARGS_A, DEFAULT_VALUE))
            );
            final DecimalNumber b = new DecimalNumber(
                    Double.valueOf(commandLine.getOptionValue(ARGS_B, DEFAULT_VALUE))
            );
            final LinearEquationSolver solver = new LinearEquationSolver(a, b);

            out.println(String.format("%s*x=%s", a, b));
            out.println(String.format("x=%s", solver.solve()));
        }
    }
}
