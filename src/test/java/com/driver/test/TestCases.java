package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static void main(String[] args) {
        com.driver.B obj=new com.driver.B();
        String ans= obj.meth();
        System.out.println(ans);
        String ans2= obj.meth();
        System.out.println(ans2);
    }
}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends com.driver.A {
    public String meth(){
        return "Invoking method from class B";
    }
}
