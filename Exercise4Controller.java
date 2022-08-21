import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Exercise4Controller {

    @FXML
    private Button btnRead;
    
    @FXML
    private Button btnWrite;

    @FXML
    private TextArea textAreaBook;

    @FXML
    private TextField txtUnitPrice;

    @FXML
    private TextField txtDesc;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtCopies;

    File myfile=new File("book.txt");

    @FXML
    void btnRead1(ActionEvent event) 
    {
        textAreaBook.clear();
        textAreaBook.appendText("Title\t\t\tDesc\t\t\tPrice\t\t\tCopies\t\t\tTotal\n");
        try 
        {
            Scanner input=new Scanner(myfile); //read mode
            if(myfile.exists())
            {
                while(input.hasNext())
                {
                    String str=input.next();
                    System.out.println(str);
                    StringBuffer sb = new StringBuffer(str);
                    Scanner scn=new Scanner(str);
                    scn.useDelimiter(",");
                    String title=scn.next();
                    System.out.println(title);
                    String desc=scn.next();
                    System.out.println(desc);
                    double unitPrice=scn.nextDouble();
                    System.out.println(unitPrice);
                    int noOfCopies=scn.nextInt();
                    System.out.println(noOfCopies);
                    double total=unitPrice*noOfCopies;
                    textAreaBook.appendText(title+"\t\t\t"+desc+"\t\t\t"+unitPrice+"\t\t\t"+noOfCopies+"\t\t\t"+total+"\n");
                }
            } 
            input.close();  
        } 
        catch (Exception e) 
        {
            System.out.println("error in file read "+e.getMessage());
        }
    }

    
    @FXML
    void btnWrite1(ActionEvent event) 
    {
        try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile,true)));
            String s=txtName.getText();
            String d=txtDesc.getText();
            StringTokenizer st = new StringTokenizer(d, " ");
            String d1 = "";
            d1=d1.concat(st.nextToken()).concat(st.nextToken());
            System.out.println(d1);
            double unit=Double.parseDouble(txtUnitPrice.getText());
            int copies=Integer.parseInt(txtCopies.getText());
            output.println(s+","+d1+","+unit+","+copies+",");
            System.out.println("file created");
            output.close();
        } 
        catch (Exception e) 
        {
            System.out.println("error in file write"+e.getMessage());
        }

         btnWrite.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
         btnRead.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");        
        
         
    }

}
