package com.caelum.exceptions;

import java.util.ArrayList;

public class MainEx3 {

    public static void main(String... args) {
        // FIXME Irá fazer recursivamente e dar erro de StackOverflow
        // main(args);

        // FIXME Irá dar o erro de OutOfMemory
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; i++)
                strings.add("string " + i + "" + j);
        System.out.println(strings.get(99999));
    }
}
