module CalculatriceFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires java.desktop;
	
	opens view to javafx.graphics, javafx.fxml;
	opens controler to javafx.graphics;
	
}
