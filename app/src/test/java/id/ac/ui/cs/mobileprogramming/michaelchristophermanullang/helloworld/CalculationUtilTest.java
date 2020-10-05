package id.ac.ui.cs.mobileprogramming.michaelchristophermanullang.helloworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculationUtilTest {



    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void incrementNumber() {
        int originalNumber = 1;
        CalculationUtil calculationUtil = new CalculationUtil();
        int incrementedNumber = calculationUtil.incrementNumber(originalNumber);
        assertEquals(originalNumber + 1, incrementedNumber);
    }
}