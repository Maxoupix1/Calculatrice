package controler;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import model.CalculatorModel;
import view.CalculatorGUI;


public class Controler implements EventHandler<ActionEvent>{

	public CalculatorGUI gui;
	public CalculatorModel calc;

	
	public Controler() {
		this.gui = new CalculatorGUI();
		this.calc = new CalculatorModel();
		gui.controler = this;
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
						gui.texte.setText(String.valueOf(calc.accu.peek()));
						break;
					}
					else {
						break;
					}
					
				case "-" :
					if (calc.accu.size() > 1) {
						calc.substract();
						gui.texte.setText(String.valueOf(calc.accu.peek()));
						break;
					}
					else {
						break;
					}
					
				case "*" :
					if (calc.accu.size() > 1) {
						calc.multiply();
						gui.texte.setText(String.valueOf(calc.accu.peek()));
						break;
					}
					else {
						break;
					}
					
				case "/" :
					if (calc.accu.size() > 1) {
						calc.divide();
						gui.texte.setText(String.valueOf(calc.accu.peek()));
						break;
					}
					else {
						break;
					}
					
				case "+/-" :
					if (calc.accu.size() > 1) {
						calc.opposite();
						gui.texte.setText(String.valueOf(calc.accu.peek()));
						break;
					}
					else {
						break;
					}
					
				default :
					calc.push(Double.valueOf(trigger.getText()));
					gui.texte.setText(String.valueOf(calc.accu.peek()));
					break;
			}
			
		}
		
	}
	
}