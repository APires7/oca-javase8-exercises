package com.strings;

public class ComparacaoStringExercicios {

	public static void main(String[] args) {
		String s1 = "s1";
        String s2 = "s" + "1";
        System.out.println(s1==s2); // True, por causa do pool de strings
        System.out.println(s1==("" + s2)); // False, porque tem uma criação de espaço vazio antes do s2
        
        
        String s3 = s1.substring(0, 1) + s1.substring(1,1);
        System.out.println(s1.substring(0, 1));
        System.out.println(s1.substring(1, 1));
        System.out.println(s1==s3); // False, cria um novo objeto
        System.out.println(s1.equals(s3)); // False, s2_substring vale "s"
        
        String s4 = s1.substring(0, 2);
        System.out.println(s1==s4); // True, pelo pool de strings (Por mais que substring devolva uma nova String, nesse caso ele devolveu a String inteira, a própria String.)
        System.out.println(s1.equals(s4)); // True, mesmo literal

	}

}
