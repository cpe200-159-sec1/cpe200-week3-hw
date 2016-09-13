package cpe200Test;

import cpe200.BinaryCalculator;
import cpe200.Operand;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;


public class BinaryCalculatorTest {
    Operand firstOperand;
    Operand secondOperand;
    BinaryCalculator binaryCalculator;
    @Before
    public void setUp() throws Exception {
        binaryCalculator = new BinaryCalculator();
    }

    @Test
    public void addStringSimple() throws Exception {
        firstOperand = new Operand("1");
        secondOperand = new Operand("1");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("2", binaryCalculator.add());
    }

    @Test
    public void subtractStringSimple() throws Exception {
        firstOperand = new Operand("1");
        secondOperand = new Operand("1");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("0", binaryCalculator.subtract());
    }

    @Test
    public void multiplyStringSimple() throws Exception {
        firstOperand = new Operand("2");
        secondOperand = new Operand("3");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("6", binaryCalculator.multiply());
    }

    @Test
    public void divideStringSimple() throws Exception {
        firstOperand = new Operand("6");
        secondOperand = new Operand("3");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("2", binaryCalculator.division());
    }

    @Test
    public void divideByZeroStringSimple() throws Exception {
        firstOperand = new Operand("2");
        secondOperand = new Operand("0");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        try {
            binaryCalculator.division();
            fail("The operation must raise an exception");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    public void addIntSimple() throws Exception {
        firstOperand = new Operand(1);
        secondOperand = new Operand(1);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("2", binaryCalculator.add());
    }

    @Test
    public void subtractIntSimple() throws Exception {
        firstOperand = new Operand(1);
        secondOperand = new Operand(1);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("0", binaryCalculator.subtract());
    }

    @Test
    public void multiplyIntSimple() throws Exception {
        firstOperand = new Operand(2);
        secondOperand = new Operand(3);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("6", binaryCalculator.multiply());

    }

    @Test
    public void divisionIntSimple() throws Exception {
        firstOperand = new Operand(6);
        secondOperand = new Operand(3);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("2", binaryCalculator.division());
    }

    @Test
    public void divideByZeroIntSimple() throws Exception {
        firstOperand = new Operand(6);
        secondOperand = new Operand(0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        try {
            binaryCalculator.division();
            fail("The operation must raise an exception");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    public void addDoubleSimple() throws Exception {
        firstOperand = new Operand(3.0);
        secondOperand = new Operand(1.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("4", binaryCalculator.add());
    }

    @Test
    public void subtractDoubleSimple() throws Exception {
        firstOperand = new Operand(3.0);
        secondOperand = new Operand(2.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("1", binaryCalculator.subtract());
    }

    @Test
    public void multiplyDoubleSimple() throws Exception {
        firstOperand = new Operand(3.0);
        secondOperand = new Operand(2.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("6", binaryCalculator.multiply());

    }

    @Test
    public void divisionDoubleSimple() throws Exception {
        firstOperand = new Operand(6.0);
        secondOperand = new Operand(3.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("2", binaryCalculator.division());

    }

    @Test
    public void divideByZeroDoubleSimple() throws Exception {
        firstOperand = new Operand(6.0);
        secondOperand = new Operand(0.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        try {
            binaryCalculator.division();
            fail("The operation must raise an exception");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    public void addStringNegative() throws Exception {
        firstOperand = new Operand("1");
        secondOperand = new Operand("-3");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-2", binaryCalculator.add());
    }

    @Test
    public void subtractStringNegative() throws Exception {
        firstOperand = new Operand("-3");
        secondOperand = new Operand("-1");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-2", binaryCalculator.subtract());
    }

    @Test
    public void multiplyStringNegative() throws Exception {
        firstOperand = new Operand("2");
        secondOperand = new Operand("-3");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-6", binaryCalculator.multiply());
    }

    @Test
    public void divideStringNegative() throws Exception {
        firstOperand = new Operand("6");
        secondOperand = new Operand("-3");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-2", binaryCalculator.division());
    }

    @Test
    public void divideByZeroStringNegative() throws Exception {
        firstOperand = new Operand("-2");
        secondOperand = new Operand("0");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        try {
            binaryCalculator.division();
            fail("The operation must raise an exception");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    public void addIntNegative() throws Exception {
        firstOperand = new Operand(1);
        secondOperand = new Operand(-3);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-2", binaryCalculator.add());
    }

    @Test
    public void subtractIntNegative() throws Exception {
        firstOperand = new Operand(-3);
        secondOperand = new Operand(-2);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-1", binaryCalculator.subtract());
    }

    @Test
    public void multiplyIntNegative() throws Exception {
        firstOperand = new Operand(-2);
        secondOperand = new Operand(-3);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("6", binaryCalculator.multiply());

    }

    @Test
    public void divisionIntNegative() throws Exception {
        firstOperand = new Operand(6);
        secondOperand = new Operand(-3);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-2", binaryCalculator.division());
    }

    @Test
    public void divideByZeroIntNegative() throws Exception {
        firstOperand = new Operand(6);
        secondOperand = new Operand(0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        try {
            binaryCalculator.division();
            fail("The operation must raise an exception");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    public void addDoubleNegative() throws Exception {
        firstOperand = new Operand(3.5);
        secondOperand = new Operand(-4.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-0.5", binaryCalculator.add());
    }

    @Test
    public void subtractDoubleNegative() throws Exception {
        firstOperand = new Operand(-3.2);
        secondOperand = new Operand(-2.3);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-0.9", binaryCalculator.subtract());
    }

    @Test
    public void multiplyDoubleNegative() throws Exception {
        firstOperand = new Operand(3.3);
        secondOperand = new Operand(-2.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-6.6", binaryCalculator.multiply());

    }

    @Test
    public void divisionDoubleNegative() throws Exception {
        firstOperand = new Operand(5.0);
        secondOperand = new Operand(-2.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
        assertEquals("-2.5", binaryCalculator.division());

    }

    @Test
    public void divisionDoubleWithRemainder() throws Exception {
        firstOperand = new Operand(5.0);
        secondOperand = new Operand(-3.0);
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);

        assertEquals("-1.66667", binaryCalculator.division());
    }


}