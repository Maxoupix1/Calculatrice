package view;

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


public class CalculatorGUI extends Application implements EventHandler {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage st) throws Exception {
		// TODO Auto-generated method stub
		GridPane gp=new GridPane();

		VBox vBox1 = new VBox();
		VBox vBox1_1 = new VBox();
		Label lab = new Label("ervuhjke");
				
		vBox1.getChildren().add(vBox1_1);
		vBox1_1.getChildren().add(lab);
		vBox1.getChildren().add(gp);
		ArrayList<Button> listeBouton = new ArrayList<>();
		for (int i = 0 ; i <= 16 ; i++) {
			listeBouton.add(new Button());
		}

		
		Button b1 = new Button("0");
		b1.setPrefSize(50, 50);

		st.setTitle("Calculatrice");
		for (int i = 0 ; i <= 16 ; i++) {
			gp.add(listeBouton[i], i, i);
		}
		gp.add(b1, 0, 3);
		gp.add(new Button("1"), 0, 2);
		gp.add(new Button("2"), 1, 2);
		gp.add(new Button("3"), 2, 2);
		gp.add(new Button("4"), 0, 1);
		gp.add(new Button("5"), 1, 1);
		gp.add(new Button("6"), 2, 1);
		gp.add(new Button("7"), 0, 0);
		gp.add(new Button("8"), 1, 0);
		gp.add(new Button("9"), 2, 0);
		
		gp.add(new Button(","), 1, 3);
		gp.add(new Button("+/-"), 2, 3);
		
		gp.add(new Button("+"), 3, 0);
		gp.add(new Button("-"), 3, 1);
		gp.add(new Button("*"), 3, 2);
		gp.add(new Button("/"), 3, 3);
		gp.add(new Button("<>"), 3, 4);
		
		/*
		 * b1.setOnAction(new EventHandler<ActionEvent>() {
			

			@Override
			public void handle(ActionEvent e) {
				
			}
			
		}
		*/

		
		Scene sc = new Scene(vBox1, 400, 700);
		st.setScene(sc);
		st.show();
		


	}
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		
	}
}