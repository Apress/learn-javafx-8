// FxIncludeTest.java
package com.jdojo.fxml;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxIncludeTest  extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws MalformedURLException, IOException {
		URL fxmlUrl = this.getClass()
		                  .getClassLoader()
		                  .getResource("resources/fxml/maindoc.fxml");

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(fxmlUrl);
		VBox root = loader.<VBox>load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Nesting Documents in FXML");
		stage.show();
	}
}
