import junit.framework.TestCase;

/**
 * Created by FakeYou on 28-3-14.
 */
public class CalculatorTest extends TestCase {

    public void testAdd() {
        assertEquals(Calculator.add(2, 5), 7);
    }

    public void testSubtract() {
        assertEquals(Calculator.subtract(2, 5), -3);
    }

    public void testMultiply() {
        assertEquals(Calculator.multiply(2, 5), 10);
    }

    public void testDivide() {
        assertEquals(Calculator.divide(10, 2), 5);
    }
}
