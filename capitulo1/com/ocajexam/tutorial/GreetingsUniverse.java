/**
 * 
 */
package capitulo1.com.ocajexam.tutorial;

import capitulo1.com.ocajexam.tutorial.planets.Earth;
import capitulo1.com.ocajexam.tutorial.planets.Mars;
import capitulo1.com.ocajexam.tutorial.planets.Venus;

/**
 * @author allan
 *
 */
public class GreetingsUniverse {

	public static void main(String[] args) {
		System.out.println("Greetings, Universe!");

		Earth e = new Earth();
		Mars m = new Mars();
		Venus v = new Venus();

	}
}
