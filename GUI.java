import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*; //
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application{
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
       // control - radio buttons
        Label lbl1=new Label("Please select your favourite languages:");
        CheckBox opt1=new CheckBox("Java");
        CheckBox opt2=new CheckBox("Python");
        CheckBox opt3=new CheckBox("CPP");
        CheckBox opt4=new CheckBox("C");

        Button submit=new Button("Submit");
        Label lbl2=new Label();
        
        submit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               String selectedoptions="";  
                if(opt1.isSelected()){
                selectedoptions+=opt1.getText();
                selectedoptions+=" ";
                }
                if(opt2.isSelected()){
                selectedoptions+=opt2.getText();
                selectedoptions+=" ";
                }
                if(opt3.isSelected()){
                selectedoptions+=opt3.getText();
                selectedoptions+=" ";
                }
                if(opt4.isSelected()){
                selectedoptions+=opt4.getText();
                selectedoptions+=" ";
                }
                if(selectedoptions.isEmpty())
                    lbl2.setText("Please select something....!!");
                else
                    lbl2.setText("Your interests are: "+selectedoptions);
            }
        });
       
  
        // add control to layout
        VBox root=new VBox();
        root.getChildren().addAll(lbl1,opt1,opt2,opt3,opt4,submit,lbl2);
       
        // add this to Scene
        Scene sc=new Scene(root);
        // add this to stage
        primaryStage.setScene(sc);
        primaryStage.setTitle("Checkbox Demo");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        
        //show the stage
        primaryStage.show();
    
      }
}