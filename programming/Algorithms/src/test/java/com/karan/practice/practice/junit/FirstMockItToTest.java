package com.karan.practice.practice.junit;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class FirstMockItToTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testIfFerraryCar() {
        assertTrue(myFerrari instanceof Car);
    }

    @Test
    public void testStubbing() {
        assertFalse("new test double should return false as boolean",
                myFerrari.needsFuel());
        when(myFerrari.needsFuel()).thenReturn(true);
        assertTrue("after instructed test double should return what we want",
                myFerrari.needsFuel());

    }

    @Test
    public void mockVerification(){
        myFerrari.driveTo("Sweet home");
        myFerrari.needsFuel();
        verify(myFerrari).driveTo("Sweet home");
    }

}
