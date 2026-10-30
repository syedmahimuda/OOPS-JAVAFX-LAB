import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextImageDisplay extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text and Image Display");
        
        Label textLabel = new Label("Hello, JavaFX!");
        textLabel.setStyle("-fx-font-size: 20px;");
        
        // Load image from local or web
        Image image = new Image("https://via.placeholder.com/200");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        
        VBox vbox = new VBox(20);
        vbox.setStyle("-fx-alignment: center; -fx-padding: 20;");
        vbox.getChildren().addAll(textLabel, imageView);
        
        Scene scene = new Scene(vbox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
