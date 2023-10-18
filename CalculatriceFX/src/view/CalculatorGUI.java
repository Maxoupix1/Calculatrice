package view;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class CalculatorGUI extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage st) throws Exception {
		// TODO Auto-generated method stub
		st.setTitle("Calculatrice");
		Label lab = new Label("Hello");
		Scene sc = new Scene(lab,100,400);
		st.setScene(sc);
		st.show();
}
}