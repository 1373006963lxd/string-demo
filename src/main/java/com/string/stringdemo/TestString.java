package com.string.stringdemo;

public class TestString {
    public static void main(String[] args) {
        /*string 是不可变类   包装类型都是引用类型*/
        String a = "abc";//放在常量池中
        String aa = new String ("abc");//放在堆中
        System.out.println(a==aa);//false
        System.out.println("=================================================");

        String b = "def";
        String cc = "abcdef";//常量池中
//        String类型a+String类型b 为对象
        System.out.println((a+b)==cc);//false
        System.out.println("=================================================");


        String dd = a+b;//对象
        System.out.println(dd==cc);//false
        System.out.println("=================================================");


        String d = "abc"+"def";//常量池中
        System.out.println(cc==d);//true
        System.out.println("=================================================");


        System.out.println(dd==d);//false
    }
}
