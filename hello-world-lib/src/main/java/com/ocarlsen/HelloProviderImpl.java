package com.ocarlsen;

/**
 * Hello world!
 */
public class HelloProviderImpl implements HelloProvider {
    public String getHello(String name) {
        if (name != null) {
            return "Hello, " + name + "!";
        }
        return "Hello World!";
    }
}
