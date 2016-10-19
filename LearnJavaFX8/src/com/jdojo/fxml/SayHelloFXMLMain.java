// SayHelloFXMLMain.java
package com.jdojo.fxml;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SayHelloFXMLMain extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		// Construct a URL for the FXML document
		String stringUrl = "resources/fxml/sayhellowithcontroller.fxml";
		URL fxmlUrl = this.getClass()
		                  .getClassLoader()
		                  .getResource(stringUrl);
				
		VBox root = FXMLLoader.<VBox>load(fxmlUrl);		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Hello FXML");
		stage.show();
	}
}
