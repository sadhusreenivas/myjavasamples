import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Demo extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        ToggleGroup group=new ToggleGroup();
        RadioButton opt1=new RadioButton("Java");
        RadioButton opt2=new RadioButton("Python");
        RadioButton opt3=new RadioButton("CPP");
        RadioButton opt4=new RadioButton("Javascript");
        RadioButton opt5=new RadioButton("C Lang");

        Button submit=new Button("Submit");
        Label lbl=new Label();
       
        submit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(opt1.isSelected()){
                lbl.setText("Welldone...u have selected"+ opt1.getText());
                lbl.setTextFill(Color.CHOCOLATE);
                }
                else if(opt2.isSelected()){
                    lbl.setText("Welldone...u have selected"+ opt2.getText());
                    lbl.setTextFill(Color.BLUE);
                    }
                else if(opt3.isSelected()){
                        lbl.setText("Welldone...u have selected"+ opt3.getText());
                        lbl.setTextFill(Color.GREEN);
                    } 
                else if(opt4.isSelected()){
                        lbl.setText("Welldone...u have selected"+ opt4.getText());
                        lbl.setTextFill(Color.YELLOW);
                    }
                else if(opt5.isSelected()){
                        lbl.setText("Welldone...u have selected"+ opt5.getText());
                        lbl.setTextFill(Color.CYAN);
                    }
                else{
                     lbl.setText("Sorry, u didnt select any option!:");
                     lbl.setTextFill(Color.RED);
                }
            }
        });
 
        opt1.setToggleGroup(group);
        opt2.setToggleGroup(group);
        opt3.setToggleGroup(group);
        opt4.setToggleGroup(group);
        opt5.setToggleGroup(group);

        VBox root=new VBox(); // layout
        root.getChildren().addAll(opt1, opt2,opt3, opt4, opt5,submit, lbl);
        
        Scene sc=new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.show();        
    }
    
}
