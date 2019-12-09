package com.shengsiyuan.jvm.classloader;

public class MyTest1 {

    public static void main(String[] args) {
        System.out.println(MyChild1.str2);
    }
}

class MyParent1{

    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1{

    public static String str2 = "welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}
