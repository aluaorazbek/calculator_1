import org.junit.Test;
import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculateBiNormalTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(NaN, tester.calculateBi(Calculator.BiOperatorModes.normal, 7.0));
    }

    @Test
    public void calculateBiAddTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.add, 5.1);
        Assertions.assertEquals(8.4, tester.calculateBi(Calculator.BiOperatorModes.normal, 3.3));
    }

    @Test
    public void calculateBiMinusTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.minus, 9.0);
        Assertions.assertEquals(6.8, tester.calculateBi(Calculator.BiOperatorModes.normal, 2.2));
    }

    @Test
    public void calculateBiMultiplyTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.multiply, 3.2);
        Assertions.assertEquals(6.4, tester.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
    }

    @Test
    public void calculateBiDivideTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.divide, 5.4);
        Assertions.assertEquals(0.9, tester.calculateBi(Calculator.BiOperatorModes.normal, 6.0));
    }

    @Test
    public void calculateBiXPowerOfYTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0);
        Assertions.assertEquals(16.0, tester.calculateBi(Calculator.BiOperatorModes.normal, 4.0));
    }


    @Test
    public void calculateEqualTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.add, 3.0);
        tester.calculateBi(Calculator.BiOperatorModes.add, 1.0);
        Assertions.assertEquals(6.0, tester.calculateEqual(2.0));
    }

    @Test
    public void resetTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.add, 5.0);
        Assertions.assertEquals(8.8, tester.calculateBi(Calculator.BiOperatorModes.add, 3.8));
        Assertions.assertEquals(NaN, tester.reset());
    }

    @Test
    public void CalculateMonoSquareTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(16.0, tester.calculateMono(Calculator.MonoOperatorModes.square, 4.0));
    }

    @Test
    public void CalculateMonoSquareRootTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(3.0, tester.calculateMono(Calculator.MonoOperatorModes.squareRoot, 9.0));
    }

    @Test
    public void CalculateMonoOneDividedByTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(0.01, tester.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 100.0));
    }

    @Test
    public void CalculateMonoSinTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(0.5, tester.calculateMono(Calculator.MonoOperatorModes.sin, java.lang.Math.PI / 6), 0.0000000001);
    }

    @Test
    public void CalculateMonoCosTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(0.5, tester.calculateMono(Calculator.MonoOperatorModes.cos, java.lang.Math.PI / 3), 0.0000000001);
    }

    @Test
    public void CalculateMonoTanTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(1.0, tester.calculateMono(Calculator.MonoOperatorModes.tan, java.lang.Math.PI / 4), 0.0000000001);
    }

    @Test
    public void CalculateMonoLogTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(3.0, tester.calculateMono(Calculator.MonoOperatorModes.log, 1000.0));
    }

    @Test
    public void CalculateMonoRateTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(.75, tester.calculateMono(Calculator.MonoOperatorModes.rate, 75.0));
    }

    @Test
    public void CalculateMonoAbsTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(3.0, tester.calculateMono(Calculator.MonoOperatorModes.abs, -3.0));
        Assertions.assertEquals(3.0, tester.calculateMono(Calculator.MonoOperatorModes.abs, 3.0));
    }

    @Test
    public void calculateBiAddZeroTest() {
        Calculator tester = new Calculator();
        tester.calculateBi(Calculator.BiOperatorModes.add, 0.0);
        Assertions.assertEquals(0.0, tester.calculateBi(Calculator.BiOperatorModes.normal, 0.0));
    }

    @Test
    public void CalculateMonoTanZeroTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(0.0, tester.calculateMono(Calculator.MonoOperatorModes.tan, 0.0), 0.0000000001);
    }

    @Test
    public void CalculateMonoTanPiTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(0.0, tester.calculateMono(Calculator.MonoOperatorModes.tan, java.lang.Math.PI), 0.0000000001);
    }

    @Test
    public void CalculateMonoTan180Test() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(1.3386902103
                , tester.calculateMono(Calculator.MonoOperatorModes.tan, 180.0), 0.0000000001);
    }

    @Test
    public void CalculateMonoTanHalfPiTest() {
        Calculator tester = new Calculator();
        Assertions.assertEquals(NaN, tester.calculateMono(Calculator.MonoOperatorModes.tan, java.lang.Math.PI/2), 0.0000000001);
    }
}