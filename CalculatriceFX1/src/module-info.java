module CalculatriceFX1 {
	requires javafx.controls;
	requires java.desktop;
	
	opens controler to javafx.graphics, javafx.fxml;
}
