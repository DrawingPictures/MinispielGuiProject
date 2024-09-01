import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Minispiel extends Application {
	
	Label colorLabel;
	
	VBox root;
	Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		
		colorLabel = new Label("Selected Color: ");
		
		ChoiceBox<String> choice = new ChoiceBox<>(
				FXCollections.observableArrayList(
						"Red", "Green", "Blue", "Yellow", "Orange", "Purple"
						)
				);
		
		choice.setOnAction(event -> {
			String selectedColor = choice.getValue();
			colorLabel.setText("Selected Color: " + selectedColor);
		});
		
		root = new VBox(10);
		root.getChildren().addAll(choice, colorLabel);
		
		scene = new Scene(root, 450, 300);
		stage.setScene(scene);
		stage.setTitle("Color Choice App");
		stage.show();
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
