package com.string.stringdemo;

public class TestInteger {
    public static void main(String[] args) {
        Integer a = 9;//常量池
        Integer aa = new Integer(9);//对象
        System.out.println(a==aa);//false

        System.out.println("=========================================");

        int b = 9;
        System.out.println(a==b);//true   Integer自动拆箱为int
        System.out.println("=========================================");

        System.out.println(aa==b);//true
        System.out.println("=========================================");

        Integer c = 127;
        Integer cc = 127;
        System.out.println(c==cc);//true
        System.out.println("=========================================");

        /*byte,short,Integer,Long,Character [-128 - 127] 超出这个范围会去创建
        * 新的对象*/
        Integer d = 128;
        Integer dd = 128;
        System.out.println(d==dd);//false
        System.out.println("=========================================");

        Integer e = 23 + 16;//常量池
        Integer ee = 39;//常量池
        System.out.println(e==ee);//true
        System.out.println("=========================================");


        Integer eee = new Integer(23+16);//对象
        System.out.println(e==eee);//false
        System.out.println("=========================================");
        System.out.println(ee==eee);//false
    }
}


