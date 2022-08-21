import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class StudentController implements Initializable{

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnNext;

    @FXML
    private Button btnPrevious;

    @FXML
    private Button btnRead;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnWrite;

    @FXML
    private TextArea tareStudent;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtFname;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtLname;

    File myfile;
    PrintWriter output;
    Scanner input;
    ArrayList<Student> list=new ArrayList<Student>();
    static int record=0;

    @FXML
    void btnAdd1(ActionEvent event) 
    {
        record=list.size();
        System.out.println("addbtn record="+record+"list size="+list.size());
        txtFname.clear();
        txtLname.clear();
        txtId.clear();
        txtAge.clear();

    }

    @FXML
    void btnSave1(ActionEvent event) 
    {
        Student st=new Student();
        st.setfName(txtFname.getText());
        st.setlName(txtLname.getText());
        st.setStudentId(Integer.parseInt(txtId.getText()));
        st.setAge(Double.parseDouble(txtAge.getText()));
        if(record==list.size()) //add record
        {
            list.add(st);
            System.out.println("savebtn if record="+record+"list size="+list.size());
        }
        else  //edit
        {
            list.set(record,st);
            System.out.println("savebtn else record="+record+"list size="+list.size());
        }
        btnAdd.setDisable(false);
    }

    @FXML
    void btnWrite1(ActionEvent event) 
    {
        try 
        {
            PrintWriter pw=new PrintWriter(myfile);  
            pw.print("");
            pw.close();  

            output=new PrintWriter(new BufferedWriter(new FileWriter(myfile,true))); //append mode
            for(int i=0;i<list.size();i++)
            {
                output.println(list.get(i).getfName()+","+list.get(i).getlName()+","+
                                list.get(i).getStudentId()+","+list.get(i).getAge());
            }
            System.out.println("writebtn file created in append mode");
            output.close();
        } 
        catch (Exception e) 
        {
            System.out.println("error in write="+e.getMessage());
        }
    }
    @FXML
    void btnRead1(ActionEvent event) 
    {
        tareStudent.clear();
        tareStudent.appendText("fname\t\tlName\t\tid\t\tage\n");
        try 
        {
            input=new Scanner(myfile); //read mode
            if(myfile.exists())
            {
            while(input.hasNext())
            {
                String s=input.next();
                Scanner scn=new Scanner(s);
                scn.useDelimiter(",");
                String fname=scn.next();
                String lname=scn.next();
                int id=scn.nextInt();
                double age=scn.nextDouble();
                tareStudent.appendText(fname+"\t\t"+lname+"\t\t"+id+"\t\t"+age+"\n");
            }
          }
          input.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in read="+e.getMessage());
        }
    }  

    @FXML
    void btnEdit1(ActionEvent event) 
    {
        btnSave.setDisable(false);
        btnAdd.setDisable(true);
        if(record==list.size()-1)
            btnNext.setDisable(true);
        else
            btnNext.setDisable(false);
            
        if(record==0)
            btnPrevious.setDisable(true);
        else
            btnPrevious.setDisable(false);
    }

    @FXML
    void btnNext1(ActionEvent event) 
    {
        try 
        {
            record++;
            txtFname.setText(list.get(record).getfName());
            txtLname.setText(list.get(record).getlName());
            txtId.setText(String.valueOf(list.get(record).getStudentId()));
            txtAge.setText(String.valueOf(list.get(record).getAge()));
            if(record==list.size()-1)
                btnNext.setDisable(true);
            else
                btnNext.setDisable(false);
            
            if(record==0)
                btnPrevious.setDisable(true);
            else
                btnPrevious.setDisable(false);


        } 
        catch (Exception e) 
        {
            System.out.println("error in next btn="+e.getMessage());
        }

    }

    @FXML
    void btnPrevious1(ActionEvent event) 
    {
        try 
        {
            record--;
            txtFname.setText(list.get(record).getfName());
            txtLname.setText(list.get(record).getlName());
            txtId.setText(String.valueOf(list.get(record).getStudentId()));
            txtAge.setText(String.valueOf(list.get(record).getAge()));
            if(record==list.size()-1)
                btnNext.setDisable(true);
            else
                btnNext.setDisable(false);
            
            if(record==0)
                btnPrevious.setDisable(true);
            else
                btnPrevious.setDisable(false);


        } 
        catch (Exception e) 
        {
            System.out.println("error in previous btn="+e.getMessage());
        }
    }

      
    public void initialize(URL url,ResourceBundle rb)
    {
        myfile=new File("student.txt");
        try 
        {
            if(myfile.exists())
            {
                // System.out.println("file exist");
                // Student st=new Student();
                // list.add(st);
                // System.out.println("initialize record="+record+"list size"+list.size());
                input=new Scanner(myfile);
                while(input.hasNext())
                {
                    String s=input.next();
                    Scanner scn=new Scanner(s);
                    scn.useDelimiter(",");
                    Student st=new Student();
                    st.setfName(scn.next());
                    st.setlName(scn.next());
                    st.setStudentId(scn.nextInt());
                    st.setAge(scn.nextDouble());
                    list.add(st);
                    txtFname.setText(list.get(record).getfName());
                    txtLname.setText(list.get(record).getlName());
                    txtId.setText(String.valueOf(list.get(record).getStudentId()));
                    txtAge.setText(String.valueOf(list.get(record).getAge()));
                }
            }
            else
            {
                System.out.println("file not exist,add record first"); 
            }
            input.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in initialize="+e.getMessage());
        }
    }

}

