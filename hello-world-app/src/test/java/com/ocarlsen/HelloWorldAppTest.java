package com.ocarlsen;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for {@link HelloWorldApp}.
 */
public class HelloWorldAppTest {

    private HelloWorldApp helloWorldApp = new HelloWorldApp();

    @Test
    public void testSayHello() throws UnsupportedEncodingException {

        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (final PrintStream printStream = new PrintStream(byteArrayOutputStream, true, UTF_8.name())) {
            helloWorldApp.sayHello(printStream);
        }

        final String data = new String(byteArrayOutputStream.toByteArray(), UTF_8);
        assertEquals(data, "Hello, Tyler Durden!");
    }

}
