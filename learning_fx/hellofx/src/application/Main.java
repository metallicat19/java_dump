package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);

		Image icon = new Image("5968282.png");

		stage.setTitle("Hello FX!");
		stage.getIcons().add(icon);

		stage.setWidth(420);
		stage.setHeight(420);
		stage.setResizable(false);

		// stage.setX(0);
		// stage.setY(0);

		stage.setFullScreen(true);
		stage.setFullScreenExitHint("u can't escape unless u press 'q'");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

		stage.setScene(scene);
		stage.show();

	}
}
