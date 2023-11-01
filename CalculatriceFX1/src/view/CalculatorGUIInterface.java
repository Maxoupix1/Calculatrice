package view;

import controler.Controler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public interface CalculatorGUIInterface {
	public void affichage();
	public Label getOutput();
	public Label getInput();
	public void registerEventHandler(EventHandler<ActionEvent> eventHandler);

}
