/**
 * Nom de classe	: CalculatorGUI
 *
 * Description		: Partie vue qui va afficher les résultats 
 *
 * Date          	: 03/11/2023
 * 
 * Version       	: Finale
 */

package view;

import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;


/**
 * La classe CalculatorGUI implémente l'interface CalculatorGUIInterface
 * @see CalculatorGUIInterface
 */
public class CalculatorGUI implements CalculatorGUIInterface{
	
	/**
	 * La saisie et le résultat sont deux textes mis en privé
	 * L'écouteur d'action est aussi en privé
	 */
	private EventHandler<ActionEvent> listener;
	private Label output = new Label("Pile : ");
	private Label input = new Label("Entrée : ");
	
	
	/**
	 * Constructeur du GUI
	 */
	public CalculatorGUI() {
	}
	
	
	/**
	 * Méthode donnant toutes les actions à effectuer pour afficher la calculatrice
	 */
	public void affichage() {
		
		// Création des boutons de la calculatrice
		VBox buttonBox = new VBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        String[][] buttonLabels = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "*"},
            {"Del", "0", ".", "/"},
            {"C", "Entrer", "+/-", "Swap"}
        };

        // Ordre d'écouter les actions sur ces boutons et mise en forme
        for (String[] row : buttonLabels) {
            HBox rowBox = new HBox(10);
            rowBox.setAlignment(Pos.CENTER);
            for (String label : row) {
                Button button = new Button(label);
                button.setMinSize(50, 50);
                button.setOnAction(event -> getListener().handle(event));
                rowBox.getChildren().add(button);
            }
            buttonBox.getChildren().add(rowBox);
        }
        
        // Création de la fenêtre
     	Stage st = new Stage();
     	st.setTitle("Calculatrice");
     		
        // Menu déroulant afin d'afficher la totalité de la pile
        ScrollPane s1 = new ScrollPane();
        s1.setPrefSize(120, 120);
        s1.setContent(getOutput());
        
        // Ajout de tout les éléments dans la fenêtre
        VBox mainLayout = new VBox(10);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(s1, getInput(), buttonBox);

        // affichage final
        Scene scene = new Scene(mainLayout, 400, 500);
		st.setScene(scene);
		st.show();
	}

	
	/**
	 * Définit un nouveau écouteur pour l'événement en paramètre
	 * @param eventHandler
	 */
	public void newListener(EventHandler<ActionEvent> eventHandler) {
        this.listener = eventHandler;
    }
	
	
	/**
	 * @return the output
	 */
	public Label getOutput() {
		return output;
	}

	
	/**
	 * @return the input
	 */
	public Label getInput() {
		return input;
	}


	/**
	 * @return the controler
	 */
	public EventHandler<ActionEvent> getListener() {
		return listener;
	}


	/**
	 * @param controler the controler to set
	 */
	public void setControler(EventHandler<ActionEvent> listener) {
		this.listener = listener;
	}


	/**
	 * @param output the output to set
	 */
	public void setOutput(Label output) {
		this.output = output;
	}


	/**
	 * @param input the input to set
	 */
	public void setInput(Label input) {
		this.input = input;
	}
}