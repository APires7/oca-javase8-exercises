package com.caelum.args;

public class MainArgs {

    public static final void main(String... strings) {
        x(strings.length);
    }

    static int x(final int l) {
        for (int i = 0; i < 100; i++) {
            // FIXME Não compila
            // switch (i) {
            // case l:
            // System.out.println(l);
            // if (l == i)
            // FIXME return vazio não compila
            // return 3;
            // case 0:
            // System.out.println(0);
            // }
        }
        System.out.println("end");
        return -1;
    }

}
