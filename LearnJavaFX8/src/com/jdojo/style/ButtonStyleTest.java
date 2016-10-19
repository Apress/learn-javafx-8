// ButtonStyleTest.java
package com.jdojo.style;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonStyleTest extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Button yesBtn = new Button("Yes");
		Button noBtn = new Button("No");
		Button cancelBtn = new Button("Cancel");

		HBox root = new HBox();
		root.getChildren().addAll(yesBtn, noBtn, cancelBtn);

		Scene scene = new Scene(root);

		// Add a style sheet to the scene
		scene.getStylesheets().add("resources/css/buttonstyles.css");

		stage.setScene(scene);
		stage.setTitle("Styling Buttons");
		stage.show();
	}
}
