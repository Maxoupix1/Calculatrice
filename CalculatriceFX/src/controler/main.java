/**
 * Nom de l'interface	: Main
 *
 * Description			: Classe principale  
 *
 * Date          		: 03/11/2023
 * 
 * Version       		: Finale
 */

package controler;

import javafx.application.Application;
import javafx.stage.Stage;
import model.CalculatorModel;
import view.CalculatorGUI;


public class main extends Application {
	
	/**
	 * Lancement de l'affichage
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	
	/**
	 * Création du controler
	 */
	@Override
	public void start(Stage primaryStage) {
		CalculatorGUI vue = new CalculatorGUI();
		CalculatorModel modele = new CalculatorModel();
		new Controler(vue, modele);
	}
}