/**
 * Nom de classe	: Pile
 *
 * Description		: Classe héritant de Stack<> pour rédéfinir son affichage 
 *
 * Date          	: 01/11/2023
 * 
 * Version       	: Finale
 */

package model;

import java.util.Stack;

public class Pile extends Stack<Double>{
	
	/**
	 * Constructeur de Pile
	 */
	public Pile() {
		super();
	}
	
	/**
	 * Redéfinition de l'affichage des piles
	 * @return String la pile sous forme de texte
	 */
	@Override
	public String toString() {
		String text = "";
		for(Double x : this) {
			text += x.toString() + "\n";
		}
		return text;
	}

}
