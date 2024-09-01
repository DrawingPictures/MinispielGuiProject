import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Minispiel extends Application {
	
	Label initLabel;
	
	TextField input;
	
	Button displayBtn;
	
	VBox root;
	
	Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		
		
		initLabel = new Label("Results will be shown here");
		
		input = new TextField();
		displayBtn = new Button("Display Text.");
		
		displayBtn.setOnAction(event -> {
			String result = input.getText();
			initLabel.setText("Entered Text: " + result);
		});
		
		root = new VBox(10);
		root.getChildren().addAll(input, displayBtn, initLabel);
		
		scene = new Scene(root, 300, 200);
		
		stage.setScene(scene);
		stage.setTitle("Text Input");
		stage.show();
		
		
	}
	
	private void showDisplay(String action, String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(action);
		alert.setHeaderText(null);
		alert.setContentText(content);
		alert.showAndWait();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
