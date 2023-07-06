package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.*;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);

		Text text = new Text();
		text.setText("I'm a text object");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 50));
		text.setFill(Color.LIMEGREEN);

		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);

		line.setStrokeWidth(5);
		line.setStroke(Color.DARKRED);
		line.setOpacity(0.5);
		line.setRotate(45);

		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(50);

		rectangle.setStrokeWidth(5);
		rectangle.setFill(Color.GOLDENROD);
		rectangle.setStroke(Color.BLACK);

		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(250.0, 200.0, 300.0, 300.0, 200.0, 300.0);
		triangle.setFill(Color.MEDIUMBLUE);

		Circle circle = new Circle();
		circle.setCenterX(300);
		circle.setCenterY(400);
		circle.setRadius(30);
		circle.setStrokeWidth(3);
		circle.setFill(Color.TURQUOISE);
		circle.setStroke(Color.GRAY);

		Image random = new Image("852346.png");
		ImageView imageView = new ImageView(random);
		int ratio = 100;
		imageView.setFitWidth(ratio);
		imageView.setFitHeight(ratio);
		imageView.setPreserveRatio(true);
		imageView.setSmooth(true);
		imageView.setCache(true);

		imageView.setX(50);
		imageView.setY(350);

		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);

		stage.setScene(scene);
		stage.show();
	}
}
