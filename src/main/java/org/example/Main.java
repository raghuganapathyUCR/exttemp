package org.example;

import javax.annotation.Nullable;

public class Main {
    static void log( Object x) {
        System.out.println(x.toString());
    }
    static void foo() {
        log(null);
    }

    public static void main(String[] args) {
        foo();
    }
}
