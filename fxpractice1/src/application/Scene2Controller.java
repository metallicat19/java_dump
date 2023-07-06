package application;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class Scene2Controller implements Initializable {

	MenuController controller = new MenuController();

	@FXML
	ChoiceBox<String> choiceBox;

	String[] scenes = { "scene1", "scene2", "scene3" };

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		choiceBox.getItems().addAll(scenes);
		choiceBox.setOnAction(this::getScene);

	}

	public void getScene(ActionEvent event) {
		String selectedScene = choiceBox.getValue();

		try {

			if (selectedScene.equals("scene1")) {
				controller.setScene1(event);

			} else if (selectedScene.equals("scene2")) {
				controller.setScene2(event);

			} else if (selectedScene.equals("scene3")) {
				controller.setScene3(event);

			}
		} catch (Exception e) {
			System.out.println("something  went wrong");
		}
	}
}
