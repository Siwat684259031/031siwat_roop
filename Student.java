public class Student {
    private int studentID;
    private String studentName;
    private double gpa;
    //public boolean gender;

    public Student(int studentID, String studentName ,double gpa){
        this.studentID = studentID;
        this.studentName = studentName;
        this.gpa = gpa;
    }

    public void displayInfo(){
        IO.println("-----Student info-----");
        IO.println("StudentID : "+this.studentID);
        IO.println("Student Name : "+studentName);
        IO.println("GPA : "+gpa);
    }
    public String getInfo(){
        return this.studentID+" "+this.studentName+" "+this.gpa;
    }
}
