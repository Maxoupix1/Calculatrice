/**
 * Nom de classe	: Controler
 *
 * Description		: Partie controleur qui va gérer les actions de la calculatrice 
 *
 * Date          	: 01/11/2023
 * 
 * Version       	: Finale
 */

package controler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import model.CalculatorModelInterface;
import view.CalculatorGUIInterface;


/**
 * La classe controler implémente les interfaces EventHandler et ControlerInterface
 * @see ControlerInterface
 */
public class Controler implements  EventHandler<ActionEvent>, ControlerInterface{
	
	/**
	 * Les interfaces CalculatorGUIInterface et CalculatorModelInterface sont liées.
	 * La mémoire courte pour l'entrée des valeurs.
	 */
	private CalculatorGUIInterface gui;
	private CalculatorModelInterface calc;
	private String memoire;

	
	/**
	 * Le constructeur prend en argument une interface pour la vue et une pour le modèle
	 * @see CalculatorGUIInterface
	 * @see CalculatorModelInterface
	 */
	public Controler(CalculatorGUIInterface gui, CalculatorModelInterface model) {
		this.gui = gui;
		this.calc = model;
		this.memoire = "";
		gui.affichage();
		gui.newListener(this);
	}
	
	
	/**
	 *  Lorsqu'un bouton est appuyé, on identifie la source et on réalise l'action en conséquence.
	 */
	@Override
	public void handle(ActionEvent action) {
		
		// identificationde la source
		Object source = action.getSource();		
		if (source instanceof Button) {
			Button trigger = (Button) source;		
			
			
			/**
			 * On change d'action à réaliser en fonction du bouton et on actualise à chaque fois l'affichage.
			 * @see CalculatorModel
			 */
			switch (trigger.getText()) {
				
				// Utilisation de la méthode add.
				case "+" :
					if (getCalc().length() > 1) {
						getCalc().add();
						getGui().getOutput().setText("Pile :\n" +  getCalc().getAccu().toString());
						break;
					}
					else {
						break;
					}
					
					
				// Utilisation de la méthode substract.	
				case "-" :
					if (getCalc().getAccu().size() > 1) {
						getCalc().substract();
						getGui().getOutput().setText("Pile :\n" +  getCalc().getAccu().toString());
						break;
					}
					else {
						break;
					}
				
					
				// Utilisation de la méthode multiply.
				case "*" :
					if (getCalc().getAccu().size() > 1) {
						getCalc().multiply();
						getGui().getOutput().setText("Pile :\n" +  getCalc().getAccu().toString());
						break;
					}
					else {
						break;
					}
				
					
				// Utilisation de la méthode divide.
				case "/" :
					if (getCalc().getAccu().size() > 1) {
						getCalc().divide();
						getGui().getOutput().setText("Pile :\n" +  getCalc().getAccu().toString());
						break;
					}
					else {
						break;
					}
					
				
				// On rajoute ou enlève "-" en fonction de s'il est déja présent dans la chaine de caractère.
				case "+/-" :
					if (memoire != "") {
						if (memoire.charAt(0) == '-') {
							memoire = memoire.replaceFirst("-", "");
						}else {
							memoire = "-" + memoire;
						}
					}
					getGui().getInput().setText("Entrée : " + memoire);
					break;

					
				// On rajoute "." s'il n'est pas déja présent dans la chaine de caractère.
				case "." :
					if (memoire.indexOf(".") == -1) {
						memoire += ".";
					}else {
						break;
					}
					getGui().getInput().setText("Entrée : " + memoire);
					break;
				
					
				// On supprime la chaine de caractère en mémoire.
				case "Del" :
					memoire = "";
					getGui().getInput().setText("Entrée : " + memoire);
					break;
					
					
				// On supprime toutes les données dans la pile.
				case "C" :
					getCalc().clear();
					getGui().getOutput().setText("Pile :\n" +  getCalc().getAccu().toString());
					break;
					
					
				// On échange les deux derniers termes de la pile.
				case "Swap" :
					if (getCalc().getAccu().size() > 1) {
						getCalc().swap();
						getGui().getOutput().setText("Pile :\n" +  getCalc().getAccu().toString());
						break;
					}
					else {
						break;
					}
						
				
				// On rentre dans la pile les valeurs contenues dans la mémoire.
				case "Entrer" :
					if ((memoire == ".")||(memoire == "")) {
						break;
					}else {
						getCalc().push(Double.valueOf(memoire));
						memoire = "";
						getGui().getInput().setText("Entrée : " + memoire);
						getGui().getOutput().setText("Pile :\n" +  getCalc().getAccu().toString());
						break;	
					}
					
					
				// On rajoute les nombres dans la mémoire.
				default :
					memoire += (trigger.getText());
					getGui().getInput().setText("Entrée : " + memoire);
					break;
			}
		}	
	}


	/**
	 * @return the gui
	 */
	public CalculatorGUIInterface getGui() {
		return gui;
	}


	/**
	 * @return the calc
	 */
	public CalculatorModelInterface getCalc() {
		return calc;
	}


	/**
	 * @return the memoire
	 */
	public String getMemoire() {
		return memoire;
	}


	/**
	 * @param the gui to set
	 */
	public void setGui(CalculatorGUIInterface gui) {
		this.gui = gui;
	}


	/**
	 * @param calc the calc to set
	 */
	public void setCalc(CalculatorModelInterface calc) {
		this.calc = calc;
	}


	/**
	 * @param memoire the memoire to set
	 */
	public void setMemoire(String memoire) {
		this.memoire = memoire;
	}
}