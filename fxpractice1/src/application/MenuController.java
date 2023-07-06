package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void setScene1(ActionEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public void setScene2(ActionEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public void setScene3(ActionEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
		stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

}
