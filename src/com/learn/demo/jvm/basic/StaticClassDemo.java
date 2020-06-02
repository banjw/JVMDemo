package com.learn.demo.jvm.basic;

class A{
    static {
        System.out.println("1");
    }
     A(){
        System.out.println("a");
    }
}

class B extends A{
    static {
        System.out.println("2");
    }

    B(){
        System.out.println("b");
    }
}

/**
 * 1
 * 2
 * a
 * b
 * a
 * b
 */
public class StaticClassDemo {
    public static void main(String[] args) {
        B b = new B();
        b = new B();
    }
}
