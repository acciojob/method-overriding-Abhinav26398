package com.driver;

public class Main {
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

