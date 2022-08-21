import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ControllerMCQ {
    @FXML
    private TextArea outputTextArea;

    @FXML
    private Button optA;

    @FXML
    private Button optB;

    @FXML
    private Button optC;

    @FXML
    private Button optD;

    @FXML
    private Label errorLabel;


    @FXML
    void optBtn (ActionEvent event){
        outputTextArea.setText("Option button clicked");
    }
}
