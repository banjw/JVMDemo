package com.learn.demo.jvm.basic;

class Window{
    Window(int marker){
        System.out.println(marker);
    }
}

/**
 * 3
 * 1
 * 2
 * House
 * 33
 * f
 * 1
 * 2
 * House
 * 33
 */
class House{
    Window w1 = new Window(1);
    House(){
        System.out.println("House");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){
        System.out.println("f");
    }
    static Window w3 = new Window(3);
}

public class InitOrderDemo {
    public static void main(String[] args) {
        House h = new House();
        h.f();
        h = new House();
    }
}
