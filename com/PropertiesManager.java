/**
 * 
 */
package com;

import java.util.Properties;

/**
 * @author allan
 *
 */
public class PropertiesManager {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.exit(0);
		}

		Properties props = System.getProperties();

		// Exemplo de nova propriedade
		props.setProperty("new_property2", "new_value2");
		switch (args[0]) {
		case "-list_all":
			props.list(System.out); // Lista todas as propriedades
			break;
		case "-list_prop":
			// Lista valor
			System.out.println(props.getProperty(args[1]));
			break;
		default:
			System.out.println("Usage: java PropertiesManager [-listAll]");
			System.out.println("java PropertiesManager [-list_prop [property]]");
			break;
		}
	}
}
