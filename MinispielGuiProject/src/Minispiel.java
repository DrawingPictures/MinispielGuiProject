import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Minispiel extends Application {
	
	private Label label;
	
	
	private Button button1;
	
	
	private GridPane gp;
	
	private VBox root;
	
	private Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		
		label = new Label("Minispiel");
		
		button1 = new Button("Click Me.");
		
		
		button1.setOnAction(event -> {
			
			//Hilfsmethode
			showAlert("Knopf gedrückt!", "Du hast auf den Knopf gedrückt");
		});
		
		root = new VBox(10);
		root.getChildren().add(button1);
		
		scene = new Scene(root, 450, 300);
		stage.setScene(scene);
		
		stage.setTitle("Mein Minispiel");
		
		stage.show();
		
	}
	
	//Implementierung der Hilfsmethode
	private void showAlert(String title, String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(content);
		alert.showAndWait();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
