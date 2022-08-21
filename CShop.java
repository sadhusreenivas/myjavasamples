import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CShop extends Application {
    //declaration of all the controls
    TextField txtMouse;
    TextField txtUsb;
    TextField txtCharger;
    TextField txtDiscount;
    CheckBox cbMouse;
    CheckBox cbUsb;
    CheckBox cbCharger;
    Label lblMouse;
    Label lblUsb;
    Label lblCharger;
    Label lblDiscount;
    Button totalBtn;
    Button resetBtn;
    Button exitBtn;
    TextArea ta;
   
    public void start(Stage primaryStage) throws Exception {
        // creating all the controls of GUI
        txtMouse = new TextField();
        txtMouse.setDisable(true);
        cbMouse = new CheckBox();
        lblMouse = new Label (" Mouse @ $10 each");
        
        txtUsb = new TextField();
        txtUsb.setDisable(true);
        cbUsb = new CheckBox();
        lblUsb = new Label (" USB @ $20 each");

        txtCharger = new TextField();
        txtCharger.setDisable(true);
        cbCharger = new CheckBox();
        lblCharger = new Label (" Charger @ $15 each");

        lblDiscount = new  Label("Substract Discount");
        txtDiscount = new TextField();
        
        totalBtn = new Button("  TOTAL  ");
        resetBtn = new Button(" RESET ");
        exitBtn = new Button(" EXIT ");

        ta = new TextArea();

        Alert a = new Alert(AlertType.NONE);
        Alert b = new Alert(AlertType.NONE);
        //creating Grid Layout
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        //adding controls to grid layout
        root.add(txtMouse,0,0,2,1);
        root.add(cbMouse,2,0);
        root.add(lblMouse,3,0,2,1);

        root.add(txtUsb,0,1,2,1);
        root.add(cbUsb,2,1);
        root.add(lblUsb,3,1,2,1);

        root.add(txtCharger,0,2,2,1);
        root.add(cbCharger,2,2);
        root.add(lblCharger,3,2,2,1);

        root.add(lblDiscount,0,3,2,1);
        root.add(txtDiscount,2,3,3,1);

        root.add(totalBtn,0,4);
        root.add(resetBtn,1,4);
        root.add(exitBtn,2,4);
        
        root.add(ta,0,5,5,5);
        
        root.setVgap(10);
        root.setHgap(7);

    // To find the total bill - event handling with lambda expression
    totalBtn.setOnAction(e ->{
    int mouseQuantity=0;
    int usbQuantity=0;
    int chargerQuantity=0;
    double discountAmount=0.0;
    double mouseTotal=0.0;
    double usbTotal=0.0;
    double chargerTotal=0.0;
    
    // Getting data and validating TextFileds with dialogbox
    try{
    if(cbMouse.isSelected()){
    mouseQuantity = Integer.parseInt(txtMouse.getText());
    mouseTotal = mouseQuantity * 10;
    ta.appendText("Mouse = $"+ mouseTotal);
    }
    if(cbUsb.isSelected()){
    usbQuantity = Integer.parseInt(txtUsb.getText());
    usbTotal = usbQuantity * 20;
    ta.appendText("\nUSB = $"+ usbTotal);
    }

    if(cbCharger.isSelected()){
    chargerQuantity = Integer.parseInt(txtCharger.getText());
    chargerTotal = chargerQuantity * 15;
    ta.appendText("\nCharger = $"+ chargerTotal);
    }
   
    discountAmount = Double.parseDouble(txtDiscount.getText());
    ta.appendText("\nDiscount = $"+ discountAmount);
    ta.appendText("\n------------------");
    
    }catch(NumberFormatException exception){
        System.out.println("Please enter digits only!");
         b.setAlertType(AlertType.ERROR);
         b.setContentText("Please enter Quantity in digits only");
         b.show();
    }

    double total = mouseTotal+usbTotal+chargerTotal-discountAmount;
    ta.appendText("\nTotal = $"+ total);
    });

    // To reset the GUI
    resetBtn.setOnAction(e ->{
    ta.setText("");
    txtMouse.setText("");
    txtMouse.setDisable(true);
    txtUsb.setText("");
    txtUsb.setDisable(true);
    txtCharger.setText("");
    txtCharger.setDisable(true);
    txtDiscount.setText("");
    cbMouse.setSelected(false);
    cbUsb.setSelected(false);
    cbCharger.setSelected(false);
    });

    // To exit from application
    exitBtn.setOnAction(e ->{
    a.setAlertType(AlertType.CONFIRMATION);
    a.setContentText("Are you sure to Exit");
    a.show();
    primaryStage.close();
    });

    // To enable textField - txtMouse
    cbMouse.setOnAction(e ->{
        txtMouse.setDisable(false);
        txtMouse.requestFocus();
    });

     // To enable textField - txtUsb
     cbUsb.setOnAction(e ->{
        txtUsb.setDisable(false);
        txtUsb.requestFocus();
    });

     // To enable textField - txtCharger
     cbCharger.setOnAction(e ->{
        txtCharger.setDisable(false);
        txtCharger.requestFocus();
    });

        //creating scene and adding layout
        Scene sc = new Scene(root,430, 460);
        // adding scene to the stage
        primaryStage.setScene(sc);
        primaryStage.setTitle("World of Computer Accessories");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}