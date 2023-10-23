package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import controler.Controler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class CalculatorGUI{
	
	public ArrayList<Button> listeBouton;
	public Controler controler;
	public Label texte = new Label("resultat");
	
	public CalculatorGUI() {
		this.listeBouton = new ArrayList<>();
	}
	
	
	public void affichage() {
		Stage st = new Stage();
		st.setTitle("Calculatrice");
		GridPane gp = new GridPane();

		Button btn_plus = new Button("+");
		Button btn_moins = new Button("-");
		Button btn_multiplier = new Button("*");
		Button btn_diviser = new Button("/");
		Button btn_plusmoins = new Button("+/-");
		Button btn_entrer = new Button("Entrer");
		Button btn_decimal = new Button(",");
		Button btn_c = new Button("C");
		
		for (int i = 0; i < 10; i++) {
			listeBouton.add(new Button());
			listeBouton.get(i).setText(String.valueOf(i));
		}
		
		
		listeBouton.addAll(Arrays.asList(btn_plus,btn_moins,btn_multiplier,btn_diviser,btn_plusmoins,btn_entrer,btn_decimal,btn_c));
		
		for (int i = 0; i < listeBouton.size(); i++) {
			listeBouton.get(i).setMaxSize(50, 50);
			listeBouton.get(i).setOnAction(controler);
			gp.add(listeBouton.get(i), (100-i)%3, (100-i)/3);
		}
		gp.add(texte, 0, 0);
		texte.setMinSize(100, 100);
		
		Scene sc=new Scene(gp, 500, 500);
		st.setScene(sc);
		st.show();
	}
	

	



}