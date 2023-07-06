package application;

import java.io.IOException;
import java.util.LinkedList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Scene1Controller {

	@FXML
	TextField inputTextField;

	public static LinkedList<String> wordLinkedList = new LinkedList<String>();
	Alert alert = new Alert(AlertType.ERROR);
	MenuController controller = new MenuController();

	public void addToList() {
		if (!inputTextField.getText().equals("")) {
			wordLinkedList.add(inputTextField.getText());
			inputTextField.setText("");
		} else {
			alert.setTitle("Input Error");
			alert.setContentText("Please input a String");
			alert.show();
		}
	}

	public void setScene1(ActionEvent event) throws IOException {
		controller.setScene1(event);
	}

	public void setScene2(ActionEvent event) throws IOException {
		controller.setScene2(event);
	}

	public void setScene3(ActionEvent event) throws IOException {
		controller.setScene3(event);
	}

}
