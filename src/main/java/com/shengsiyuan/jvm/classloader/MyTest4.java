package com.shengsiyuan.jvm.classloader;

public class MyTest4 {

    public static void main(String[] args) {

        MyParent4[] myParent4s= new MyParent4[1];
        System.out.println(myParent4s.getClass());

        MyParent4[][] myParent4s1 = new MyParent4[1][1];
        System.out.println(myParent4s1.getClass());
    }
}

class MyParent4{
    static {
        System.out.println("MyParent4 static block");
    }
}
