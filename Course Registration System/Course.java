import java.util.Vector;
public class Course {

    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private  Vector <Student>classList; // contains all students registered in this course

//
    public Course(String code, int number, Department dept, String title) {//initializes the classlist
        //assigns values to the variables
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        this.classList = new Vector<Student>();//create vector list for students in the class
    }

    public Course(){
        // TODO Auto-generated constructor stub
    }

    // returns the course number
    public int getNumber() {
        return number;
    }

    // returns the course code
    public String getCode() {
        return code;
    }

    // returns the list of students in the course
    public Vector<Student> getList(){
        return classList;
    }

    // adds student to classlist
    public void addStudentToCourse(Student student){
        this.classList.add(student);
    }

    // displays the course code,number, name and the amount of students that have registered
    public String toString() {
        return this.code + ", " + this.number + "" +  ", " + this.title + " Enrollment = " + String.valueOf(this.classList.size());
    }

}