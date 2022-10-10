package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static void main(String[] args) {
        class A {
            public String meth(){
                return "Invoking method from class A";
            }
        }
        class B extends A{
            public String meth(){
                return "Method is overridden in Extendend class B";
            }
        }
        B obj=new B();
        String ans= obj.meth();
        System.out.println(ans);
        String ans2= obj.meth();
        System.out.println(ans2);
    }
}

