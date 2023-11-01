module CalculatriceFX1 {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.base;
	
	opens controler to javafx.graphics, javafx.fxml;
}
