/**
 * Nom de l'interface	: ControlerInterface
 *
 * Description			: Interface en charge du controler 
 *
 * Date          		: 01/11/2023
 * 
 * Version       		: Finale
 */

package controler;

import javafx.event.ActionEvent;

public interface ControlerInterface{
	
	/**
	 * Déclaration de la méthode qui va gérer les événements
	 */
	public void handle(ActionEvent action);
}