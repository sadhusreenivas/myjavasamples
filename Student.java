public class Student //non gui , user defined class
{
    private String fName,lName;
    private int StudentId;
    private double age;
    public Student() //no agrs
    { 

    }
    public Student(String fName, String lName, int StudentId, double age) {
        this.fName = fName;
        this.lName = lName;
        this.StudentId = StudentId;
        this.age = age;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getStudentId() {
        return StudentId;
    }
    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    
}
