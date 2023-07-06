package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private Button logoutButton;

	@FXML
	private AnchorPane scenePane;

	Stage stage;

	public void logout(ActionEvent event) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("you are about to logout");
		alert.setContentText("would you like to save before logging out?");

		if (alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) scenePane.getScene().getWindow();
			System.out.println("you have succesfully logged out of the stage");
			stage.close();
		}
	}

}
