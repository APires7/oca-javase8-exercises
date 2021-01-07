package com.strings;

class ObjectEquals {
    public static void main(String[] args) {
        C a = new C();
        C b = new B();
        a.x = 1;
        b.x = 1;
        System.out.println(a==b); // False, porque são referencias diferentes
        System.out.println(a.equals(b)); // True
    }
}

class B extends C{}

class C {
    int x;
    public boolean equals(C c) {
        return c.x==x;
    }
}