import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*; 
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class SimpleCalc extends Application {
    
      TextField tfNum1;
      TextField tfNum2;
      Button btnDivide;
      Button btnMultiply;
      Button btnAddition;
      Button btnSubtraction;
      Button btnModulus;
      Button btnClear;
      Label lblAnswer;  
      
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
      
      tfNum1 = new TextField();
      tfNum2 = new TextField();
      btnDivide = new Button("/");
      btnMultiply = new Button("*");
      btnAddition = new Button("+");
      btnSubtraction = new Button("-");
      btnModulus =new Button("%");
      btnClear = new Button("Clear");
      lblAnswer = new Label("Result");
       
      lblAnswer.setAlignment(Pos.CENTER);
      lblAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
        
      GridPane root = new GridPane();
      root.setAlignment(Pos.CENTER);
       
      root.setHgap(10);
      root.setVgap(10);
       
      root.add(tfNum1, 0, 0);
      root.add(tfNum2, 1, 0);

      root.add(btnAddition, 0, 1);
      root.add(btnSubtraction, 1, 1);

      root.add(btnDivide, 0, 2);
      root.add(btnMultiply, 1, 2);

      root.add(btnModulus, 0, 3);
      root.add(btnClear, 1, 3);

      root.add(lblAnswer, 0, 4, 2, 1);

      

      setWidths(); // GUI styling
      attachCode(); // Event handling
       
     Scene scene = new Scene(root, 400, 350);
     primaryStage.setTitle("Simple Calculator");
     primaryStage.setScene(scene);
     primaryStage.show();
      
    } 
    private  void setWidths() {
    tfNum1.setPrefWidth(70);
    tfNum2.setPrefWidth(70);
    btnDivide.setPrefWidth(70);
    btnMultiply.setPrefWidth(70);
    btnAddition.setPrefWidth(70);
    btnSubtraction.setPrefWidth(70);
    btnModulus.setPrefWidth(70);
    btnClear.setPrefWidth(70);
    lblAnswer.setPrefWidth(150);
   
    }
    
   public void attachCode() {
   //have each button run BTNCODE when clicked
   btnAddition.setOnAction(e -> btncode(e));
   btnSubtraction.setOnAction(e -> btncode(e));
   btnMultiply.setOnAction(e -> btncode(e));
   btnDivide.setOnAction(e -> btncode(e));
   btnClear.setOnAction(e -> btncode(e));
   btnModulus.setOnAction(e -> btncode(e));
  }

  private void btncode(ActionEvent e) {
        int num1, num2, answer;
        char symbol;
    //e tells us which button was clicked
    if (e.getSource() == btnClear) {
    tfNum1.setText("");
    tfNum2.setText("");
    lblAnswer.setText("Result");
    tfNum1.requestFocus();
    return;
    }
    
    //read numbers in from textfields
    num1 = Integer.parseInt(tfNum1.getText());
    num2 = Integer.parseInt(tfNum2.getText());

    if (e.getSource() == btnAddition) {
   symbol = '+';
   answer = num1 + num2;
    } else if (e.getSource() == btnSubtraction) {
   symbol = '-';
   answer = num1 - num2;
    } else if (e.getSource() == btnMultiply) {
   symbol = 'x';
   answer = num1 * num2;
    } else if (e.getSource() == btnDivide){
   symbol = '/';
   answer = num1 / num2;
    } else{
      symbol='%';
      answer = num1 % num2;
    }
  //display answer
    lblAnswer.setText("" + num1 + symbol + num2 + "=" + answer);
    
   }
}
