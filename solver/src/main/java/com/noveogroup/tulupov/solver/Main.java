package com.noveogroup.tulupov.solver;

/**
 * Linear equation solver app.
 */
public class Main {
    private static Launcher launcher = new Launcher(System.out);

    /**
     * Set app launcher.
     * @param launcher the launcher
     */
    public static void setLauncher(final Launcher launcher) {
        Main.launcher = launcher;
    }

    /**
     * Starts the app.
     * @param args the app arguments
     */
    public static void main(final String[] args) {
        launcher.run(args);
    }
}
