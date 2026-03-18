import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }
@Test
public void testSubtract() {
    Calculator c = new Calculator();
    assertEquals(2, c.subtract(5, 3));
}

@Test
public void testMultiply() {
    Calculator c = new Calculator();
    assertEquals(6, c.multiply(2, 3));
}

@Test(expected = ArithmeticException.class)
public void testDivideByZero() {
    Calculator c = new Calculator();
    c.divide(5, 0);
}
 
}

 