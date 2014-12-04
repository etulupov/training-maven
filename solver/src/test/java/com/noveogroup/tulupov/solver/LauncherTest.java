package com.noveogroup.tulupov.solver;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Launcher test.
 */
public class LauncherTest {
    @Test
    public void simpleTest() {
        final PrintStream printStreamMock = Mockito.mock(PrintStream.class);
        final String[] args = new String[]{"-a", "1", "-b", "2"};

        final Launcher launcher = new Launcher(printStreamMock);
        launcher.run(args);

        final InOrder inOrder = inOrder(printStreamMock);
        inOrder.verify(printStreamMock).println("1.0*x=2.0");
        inOrder.verify(printStreamMock).println("x=2.0");
        inOrder.verifyNoMoreInteractions();
    }
}
