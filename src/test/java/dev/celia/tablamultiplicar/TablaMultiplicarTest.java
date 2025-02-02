package dev.celia.tablamultiplicar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TablaMultiplicarTest {

    @Test
    public void tesGenerarTablaMultiplicar() {
        int n = 7;
        List<String> expectedOutput = List.of(
            "7 x 1 = 7",
            "7 x 2 = 14",
            "7 x 3 = 21",
            "7 x 4 = 28",
            "7 x 5 = 35",
            "7 x 6 = 42",
            "7 x 7 = 49",
            "7 x 8 = 56",
            "7 x 9 = 63",
            "7 x 10 = 70"
        );

        assertEquals(expectedOutput, TablaMultiplicar.generarTablaMultiplicar(n));

}
}
