package com.args;

class B {

    int b = 15;

    void b(int b) {
        this.b = b;
    }
}

public class MainClassB {

    public static void main(String[] args) {
        B b = new B();
        b.b = 10;
        
        System.out.println(b.b);
        
        b.b(30);
        System.out.println(b.b);
    }

}
