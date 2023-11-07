/**
 * Nom de l'interface	: CalculatorGUIInterface
 *
 * Description			: Interface en charge de l'affichage 
 *
 * Date          		: 03/11/2023
 * 
 * Version       		: Finale
 */

package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public interface CalculatorGUIInterface {
	
	/**
	 * Déclaration de la méthode pour ajouter un écouteur d'événement, pour afficher la fenêtre et 
	 * pour récupérer la saisie et le résultat depuis l'extérieur
	 */
	public void affichage();
	public void newListener(EventHandler<ActionEvent> listener);
	public Label getInput();
	public Label getOutput();
}