package com.example.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Before : @Test 를 시작하기 전 사전에 진행해야 할 사전 정의에 해당됩니다. @Test가 시작되기 전 항상 호출하게 됩니다.
 *
 * @Test : @Before가 완료되면 실제 코드 테스트를 진행하게 됩니다.
 */


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        int result = calculator.add(15,10);
        assertEquals(25, result);
    }

    @Test
    public void subtractTest() {
        int result = calculator.subtract(15,10);
        assertEquals(5, result);
    }

}
