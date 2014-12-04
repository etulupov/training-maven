package com.noveogroup.tulupov.solver;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

/**
 * Main test.
 */
public class MainTest {
    @Test
    public void entryPointTest() {
        final Launcher launcherMock = Mockito.mock(Launcher.class);
        final String[] args = new String[]{"first", "second", "third"};

        Main.setLauncher(launcherMock);
        Main.main(args);

        verify(launcherMock, only()).run(args);
    }
}
