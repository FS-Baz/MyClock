import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
   
    }

    @Override
    public void start(Stage PrimaryStage) throws Exception {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("MyClockController.fxml"));
            Scene scene = new Scene(root);



            PrimaryStage.setTitle("Clock");
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
        } catch (Exception e) {
          
        }
            

        
        
    }
}
