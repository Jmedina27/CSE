/***
* CSE292 - Fall 2018

* RandomSequences.java

* Purpose: generates 20 sentences by selecting words at random and displays them
*

* @author Jesus Medina

* @version 1.0 11/11/2018

*/
package HomeWork14_5;
import java.util.Random;

public class RandomSequences {

	public static void main(String[] args) {
		
		//create generator using Random utility
		Random generator = new Random();
		
		//create a an array of string called article which holds 5 articles 
		String article[] = {" the ", " a ", " one ", " some ", " any "};
		//create an array of strings called noun which hold 5 nouns
		String noun[] = {" boy ", " girl ", " dog ", " town ", " car "};
		//create an array of string called verb which holds 5 verbs
		String verb[] = {" drove ", " jumped ", " ran ", " walked ", " skipped "};
		//create an array of strings called preposition which holds 5 prepositions
		String preposition[] = {" to ", " from ",  " over ", " under ", " on "};
	
		
		for (int i = 0; i < 20; i++) {
			int art1 = generator.nextInt(article.length);
			int noun1 = generator.nextInt(noun.length);
			int vrb1 = generator.nextInt(verb.length);
			int prep = generator.nextInt(preposition.length);
			int art2 = generator.nextInt(article.length);
			int noun2 = generator.nextInt(noun.length);
			
			StringBuilder buffer = new StringBuilder();
			
			buffer.append(article[art1] + noun[noun1] + verb[vrb1] + 
					preposition[prep] + article[art2] + noun[noun2] + ".\n");
			buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
			
			System.out.println(buffer.toString());
		}
	
	
	
	}

}
