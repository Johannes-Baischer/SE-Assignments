package calc;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalcExceptionTest {
    
    @Test
    public void testCalcExceptionWithThrowable() {
        assertThrows(CalcException.class, () -> {throw new CalcException("Exception", new Exception());});
    }
}
