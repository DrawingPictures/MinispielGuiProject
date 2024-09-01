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
	
	private Label nameLabel;
	private Label ageLabel;
	
	private TextField nameField;
	private TextField ageField;
	
	
	private Button submitBtn;
	private Button clearBtn;
	
	private VBox root;
	
	private Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		
		
		nameLabel = new Label("Name: ");
		nameField = new TextField();
		
		ageLabel = new Label("Age: ");
		ageField = new TextField();
		
		submitBtn = new Button("Submit");
		clearBtn = new Button("Clear");
		
		root = new VBox(10);
		root.getChildren().addAll(nameLabel, ageLabel, nameField, ageField, submitBtn, clearBtn);
		
		submitBtn.setOnAction(event -> {
			String name = nameField.getText();
			String age = ageField.getText();
			showDisplay("Information", "Name: " + name + "\nAge: " + age);
		});
		
		//Reinigt den Textfeld wenn man auf den "Clear"-Knopf drückt
		clearBtn.setOnAction(event -> {
			nameField.clear();
			ageField.clear();
		});
		
		
		scene = new Scene(root, 300, 200);
		stage.setScene(scene);
		
		stage.setTitle("Minispiel");
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
