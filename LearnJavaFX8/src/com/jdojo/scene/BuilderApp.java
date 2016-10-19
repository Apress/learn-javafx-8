// BuilderApp.java
package com.jdojo.scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

@SuppressWarnings("deprecation")
@Deprecated
public class BuilderApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Scene scene = SceneBuilder.create()
		              .width(300)
		              .height(100)
		              .root(VBoxBuilder.create()
		                    .children(LabelBuilder.create()
		                              .text("Hello Builder")
		                              .build(), 
		                              ButtonBuilder.create()
		                              .text("Exit")
		                              .onAction(e -> Platform.exit())
		                              .build()
		                             )
		                    .build()
		                   )
		              .build();

		stage.setScene(scene);
		stage.setTitle("Using Builder Classes");
		stage.show();		
	}
}
