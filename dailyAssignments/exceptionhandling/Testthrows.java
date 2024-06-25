package exceptionhandling;

import java.io.IOException;

public class Testthrows {
    public static void main(String args[]) throws IOException {
        ThrowsExample m = new ThrowsExample();
        m.method();

        System.out.println("Normal flow...");
    }
}