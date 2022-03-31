package sbp.branching;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sbp.common.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.mockito.ArgumentMatchers.anyString;

public class MyCyclesTest
{
    /**
     * Проверка количества обращений к {@link Utils} *
     */
    @Test
    public void cycleForExample_Test()
    {
        final int iterations = 2;

        Utils utilsMock = Mockito.mock(Utils.class);
        Mockito.when(utilsMock.utilFunc1(anyString())).thenReturn(true);

        MyCycles myCycles = new MyCycles(utilsMock);
        myCycles.cycleForExample(iterations, "Hello!");

        Mockito.verify(utilsMock, Mockito.times(iterations)).utilFunc1(anyString());
    }

    /**
     * Проверка количества обращений к {@link Utils} *
     */
    @Test
    public void cycleWhileExample_Test()
    {
        final int iterations = 3;

        Utils utilsMock = Mockito.mock(Utils.class);
        Mockito.when(utilsMock.utilFunc1(anyString())).thenReturn(false);

        MyCycles myCycles = new MyCycles(utilsMock);
        myCycles.cycleWhileExample(iterations, "Hello!");

        Mockito.verify(utilsMock, Mockito.times(1)).utilFunc1(anyString());
    }

    /**
     * Проверка количества обращений к {@link Utils} *
     */
    @Test
    public void cycleDoWhileExample_Test()
    {
        final int from = 3;
        final int to = 2;

        Utils utilsMock = Mockito.mock(Utils.class);
        Mockito.when(utilsMock.utilFunc1(anyString())).thenReturn(false);

        MyCycles myCycles = new MyCycles(utilsMock);
        myCycles.cycleDoWhileExample(from, to, "Hello!");

        Mockito.verify(utilsMock, Mockito.times(1)).utilFunc1(anyString());
    }

}
