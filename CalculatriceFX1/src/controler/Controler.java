package controler;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import model.CalculatorModelInterface;
import view.CalculatorGUIInterface;


public class Controler implements EventHandler<ActionEvent>, ControlerInterface{

	public CalculatorGUIInterface gui;
	public CalculatorModelInterface calc;
	public String memoire;

	
	public Controler(CalculatorGUIInterface gui, CalculatorModelInterface model) {
		this.gui = gui;
		this.calc = model;
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
						gui.getOutput().setText("Pile :\n" +  calc.getAccu().toString());
						memoire = "";
						break;
					}
					else {
						break;
					}
					
				case "-" :
					if (calc.getAccu().size() > 1) {
						calc.substract();
						gui.getOutput().setText("Pile :\n" +  calc.getAccu().toString());
						memoire = "";
						break;
					}
					else {
						break;
					}
					
				case "*" :
					if (calc.getAccu().size() > 1) {
						calc.multiply();
						gui.getOutput().setText("Pile :\n" +  calc.getAccu().toString());
						memoire = "";
						break;
					}
					else {
						break;
					}
					
				case "/" :
					if (calc.getAccu().size() > 1) {
						calc.divide();
						gui.getOutput().setText("Pile :\n" +  calc.getAccu().toString());
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
					gui.getInput().setText("Entrée : " + memoire);
					break;

					
				
				case "." :
					if (memoire.indexOf(".") == -1) {
						memoire += ".";
					}else {
						break;
					}
					gui.getInput().setText("Entrée : " + memoire);
					break;
					
				case "C" :
					memoire = "";
					gui.getInput().setText("Entrée : " + memoire);
					break;
				
				case "Entrer" :
					if ((memoire == ".")||(memoire == "")) {
						System.out.println(memoire);
						break;
					}else {
						System.out.println(memoire);
						calc.push(Double.valueOf(memoire));
						memoire = "";
						gui.getInput().setText("Entrée : " + memoire);
						gui.getOutput().setText("Pile :\n" +  calc.getAccu().toString());
						break;	
					}
					
					
				default :
					memoire += (trigger.getText());
					gui.getInput().setText("Entrée : " + memoire);
					break;
			}
			
		}
		
	}



	
}