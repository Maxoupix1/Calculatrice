module CalculatriceFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	
	opens view to javafx.graphics, javafx.fxml;
}
