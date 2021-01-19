package com.ebook.caelum;

import java.io.File;
import java.util.ArrayList;

public class Existing {

	public static void main(String[] args) {
		ArrayList<String> existing = new ArrayList<String>();
		
		for(String arg : args) {
			if(new E().exists(arg))
				existing.add(arg);
		}

	}

}

class E {
	public boolean exists(String name) {
		File f = new File(name);
		return f.exists();
	}
}
