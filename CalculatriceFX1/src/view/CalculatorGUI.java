package view;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.control.ScrollPane;
import controler.Controler;
import controler.ControlerInterface;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;



public class CalculatorGUI implements CalculatorGUIInterface{
	
	public ArrayList<Button> listeBouton;
	public ControlerInterface controler;
	public Label output = new Label("Pile : ");
	public Label input = new Label("Entrée : ");
	
	public CalculatorGUI() {
		this.listeBouton = new ArrayList<>();
	}
	
	
	public void affichage() {
		Stage st = new Stage();
		st.setTitle("Calculatrice");				
		
		VBox buttonBox = new VBox(10);
        buttonBox.setAlignment(Pos.CENTER);

        String[][] buttonLabels = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "*"},
            {"C", "0", ".", "/"},
            {"Entrer", "+/-"}
        };

        for (String[] row : buttonLabels) {
            HBox rowBox = new HBox(10);
            rowBox.setAlignment(Pos.CENTER);
            for (String label : row) {
                Button button = new Button(label);
                button.setMinSize(50, 50);
                button.setOnAction((EventHandler<ActionEvent>) controler);
                rowBox.getChildren().add(button);
            }
            buttonBox.getChildren().add(rowBox);
        }
        
        ScrollPane s1 = new ScrollPane();
        s1.setPrefSize(120, 120);
        s1.setContent(output);
        
        VBox mainLayout = new VBox(10);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(s1, input, buttonBox);

        Scene scene = new Scene(mainLayout, 400, 500);
		
		st.setScene(scene);
		st.show();
	}


	@Override
	public Label getOutput() {
		// TODO Auto-generated method stub
		return output;
	}


	@Override
	public Label getInput() {
		// TODO Auto-generated method stub
		return input;
	}
	

	



}