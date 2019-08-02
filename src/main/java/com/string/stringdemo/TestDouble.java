package com.string.stringdemo;

public class TestDouble {
    public static void main(String[] args) {
        Double a = 3.5;
        System.out.println(a);//3.5
        Double aa = 3.5;
        System.out.println(aa);//3.5
        /*double,float 没有实现常量池技术 */
        System.out.println(a==aa);//fasle

        System.out.println("==========================");
        Float b = 3.5f;
        Float bb = 3.5f;
        System.out.println(b==bb);//false

    }
}
