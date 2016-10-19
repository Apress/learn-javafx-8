// SayHelloFXML.java
package com.jdojo.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.net.URL;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SayHelloFXML extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		// Construct a URL for the FXML document
		URL fxmlUrl = this.getClass()
		                  .getClassLoader()
		                  .getResource("resources/fxml/sayhello.fxml");

		// Load the FXML document
		VBox root = FXMLLoader.<VBox>load(fxmlUrl);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Hello FXML");
		stage.show();
	}
}
