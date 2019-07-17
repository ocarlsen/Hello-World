package com.ocarlsen;

import java.io.PrintStream;

/**
 * Hello world!
 */
public class HelloWorldApp {

    private final HelloProvider helloProvider;

    HelloWorldApp() {
        this(new HelloProviderImpl());
    }

    private HelloWorldApp(final HelloProvider helloProvider) {
        this.helloProvider = helloProvider;
    }

    void sayHello(final PrintStream out) {
        final String hello = helloProvider.getHello("Tyler Durden");
        out.print(hello);
    }

    public static void main(final String[] args) {
        final HelloWorldApp helloWorldApp = new HelloWorldApp();
        helloWorldApp.sayHello(System.out);
        System.out.println();
    }
}
