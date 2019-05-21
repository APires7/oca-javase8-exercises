package com.constructors;

public class Swan {

    int numberEggs; // Instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // Set Variable
        System.out.println(mother.numberEggs); // Read variable
    }

}
