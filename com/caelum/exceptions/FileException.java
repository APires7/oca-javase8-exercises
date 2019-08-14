package com.caelum.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileException {

    /**
     * Add throws FileNotFountException
     * 
     * @return
     * @throws FileNotFoundException
     */
    public InputStream x() throws FileNotFoundException {
        return new FileInputStream("teste.txt");
    }

    /**
     * Add throws IOException
     * 
     * @throws IOException
     */
    public void z() throws IOException {
        InputStream is = x();
        is.close();
    }

}
