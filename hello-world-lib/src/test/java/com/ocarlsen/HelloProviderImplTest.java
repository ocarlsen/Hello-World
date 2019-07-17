package com.ocarlsen;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple HelloProviderImpl.
 */
@RunWith(Theories.class)
public class HelloProviderImplTest {

    @DataPoints
    public static final String[] NAMES = {"Joe", "Blow"};

    private final HelloProviderImpl helloProvider = new HelloProviderImpl();

    @Test
    public void testGetHello_null() {
        String hello = helloProvider.getHello(null);
        assertEquals(hello, "Hello World!");
    }

    @Theory
    public void testGetHello(String name) {
        String hello = helloProvider.getHello(name);
        assertEquals(hello, "Hello, " + name + "!");
    }

}
