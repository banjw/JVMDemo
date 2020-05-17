package com.learn.demo.jvm;

/**
 * 可作为GC roots的对象
 * 1.虚拟机栈（栈帧中的局部变量区，也叫做变量表）中引用的对象
 * 2.方法去中的类静态属性引用的对象
 * 3.方法区中常量引用的对象
 * 4.本地方法栈中JNI（Native方法）引用的对象
 */
public class GCRootsDemo {
    private byte[] byteArray = new byte[100*1024*1024];

//    private static GCRootsDemo2 t2;
//    private static final GCRootsDemo3 t3;

    public static void m1(){
        GCRootsDemo gcRootsDemo =  new GCRootsDemo();
        System.gc();
        System.out.println("第一次GC完成");
    }

    public static void main(String[] args) {
        m1();
    }
}
