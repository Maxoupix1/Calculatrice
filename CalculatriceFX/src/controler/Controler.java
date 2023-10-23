package controler;



import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import model.CalculatorModel;
import view.CalculatorGUI;


public class Controler implements EventHandler<ActionEvent>{

	public CalculatorGUI gui;
	public CalculatorModel calc;
	public String memoire;

	
	public Controler() {
		this.gui = new CalculatorGUI(this);
		this.calc = new CalculatorModel();
		this.memoire = "";
		gui.affichage();
	}
	

	@Override
	public void handle(ActionEvent action) {
		Object source = action.getSource();
		
		if (source instanceof Button) {
			Button trigger = (Button) source;
			
			switch (trigger.getText()) {
				case "+" :
					if (calc.length() > 1) {
						calc.add();
						gui.output.setText("Pile :\n" +  calc.accu.toString());
						memoire = "";
						break;
					}
					else {
						break;
					}
					
				case "-" :
					if (calc.accu.size() > 1) {
						calc.substract();
						gui.output.setText("Pile :\n" +  calc.accu.toString());
						memoire = "";
						break;
					}
					else {
						break;
					}
					
				case "*" :
					if (calc.accu.size() > 1) {
						calc.multiply();
						gui.output.setText("Pile :\n" +  calc.accu.toString());
						memoire = "";
						break;
					}
					else {
						break;
					}
					
				case "/" :
					if (calc.accu.size() > 1) {
						calc.divide();
						gui.output.setText("Pile :\n" +  calc.accu.toString());
						memoire = "";
						break;
					}
					else {
						break;
					}
					
				case "+/-" :
					if (memoire != "") {
						if (memoire.charAt(0) == '-') {
							memoire = memoire.replaceFirst("-", "");
						}else {
							memoire = "-" + memoire;
						}
					}
					gui.input.setText("Entrée : " + memoire);
					break;

					
				
				case "." :
					if (memoire.indexOf(".") == -1) {
						memoire += ".";
					}else {
						break;
					}
					gui.input.setText("Entrée : " + memoire);
					break;
					
				case "C" :
					memoire = "";
					gui.input.setText("Entrée : " + memoire);
					break;
				
				case "Entrer" :
					if ((memoire == ".")) {
						System.out.println(memoire);
						break;
					}else {
						System.out.println(memoire);
						calc.push(Double.valueOf(memoire));
						memoire = "";
						gui.input.setText("Entrée : " + memoire);
						gui.output.setText("Pile :\n" +  calc.accu.toString());
						break;	
					}
					
					
				default :
					memoire += (trigger.getText());
					gui.input.setText("Entrée : " + memoire);
					break;
			}
			
		}
		
	}
	
}