package com.learn.demo.jvm.oom;

public class StackOverFlowDemo {
    public static void main(String[] args) {
        stackOverFlow();
    }
    static void stackOverFlow(){//栈空间撑满
        stackOverFlow();//java.lang.StackOverflowError
    }
}
