import javafx.application.Application;
import javafx.collections.FXCollections;
import java.io.FileInputStream;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Minispiel extends Application {
	
	Image image;
	ImageView view;
	StackPane pane; 
	Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		
		FileInputStream inputStream = new FileInputStream("C:\\Users\\m-sul\\OneDrive\\Desktop\\Java Projekte\\Images\\6d7a8f2b02f6fcee5a3a09a9d0b6740c.png");
		image = new Image(inputStream);
		
		view = new ImageView(image);
		
		pane = new StackPane();
		pane.getChildren().add(view);
		
		scene = new Scene(pane, 800, 600);
		stage.setScene(scene);
		stage.setTitle("Color Choice App");
		stage.show();
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
