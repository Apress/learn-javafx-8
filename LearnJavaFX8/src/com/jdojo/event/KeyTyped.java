// KeyTyped.java
package com.jdojo.event;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class KeyTyped extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Label nameLbl = new Label("Name:");
		TextField nameTfl = new TextField();

		HBox root = new HBox();
		root.setPadding(new Insets(20));
		root.setSpacing(20);
		root.getChildren().addAll(nameLbl, nameTfl);

		// Add key-typed event to the TextField
		nameTfl.setOnKeyTyped(e -> handle(e));

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Key Typed Event");
		stage.show();
	}

	public void handle(KeyEvent e) {
		// Consume the event if it is not a letter
		String str = e.getCharacter();
		int len = str.length();
		for(int i = 0; i < len; i++) {
			Character c = str.charAt(i);
			if (!Character.isLetter(c)) {
				e.consume();
			}
		}
		
		// Print the details if it is not consumed
		if (!e.isConsumed()) {
			String type = e.getEventType().getName();
			System.out.println(type + ": Character=" + e.getCharacter());		    
		}
	}
}
