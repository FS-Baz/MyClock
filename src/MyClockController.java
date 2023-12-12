import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class MyClockController implements Initializable {

    @FXML
    private Label ClockText;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       Timeline timeline = new Timeline(
        new KeyFrame(Duration.seconds(1.0), e -> {

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        Date date = new Date();
        ClockText.setText(sdf.format(date));
    
    })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
