package tut_04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void addtest(){
        assertEquals(10, Calc.add(5, 5));
        assertEquals(3, Calc.add(2, 1));
    }
}
