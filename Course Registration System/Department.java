import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    public Department(String name, String id) {//initialize the vectors
        //initialize name and id
        this.name = name;
        this.id = id;
        this.courseList = new Vector<Course>();//new vectors to store lists of registerlist and courses
        this.registerList = new Vector<Student>();
    }

//getter for name
   public String getName() {
        return name;
    }

    // getter for id
    public String getId() {
        return id;
    }

    // adds a course to the course list
    public void offerCourse(Course course){
        this.courseList.add(course);
    }

    // prints information about the course for each course
    public void printCoursesOffered(){
        for (Course course : this.courseList) {
            System.out.println(course);
        }
    }

    // if the student is registered, it returns
    public boolean isStudentRegistered(Student student){
        return this.registerList.contains(student);
    }


    public void registerStudentCourseInDepartment(Student student,Course course){
        // adds student to list if not already registered after verifying whether they are
        if(student.isRegisteredInCourse(course) == false){
            this.courseList.add(course);
        }

        // if student isn't registered, adds them to the list
        if(isStudentRegistered(student) == false){
            this.registerList.add(student);
        }
    }


    public void printStudentsByName(){
        // goes through the register to list all students in the list
        for(Student register : registerList){
            System.out.println(register.toString());
        }
    }

//outputs the numbers of students a course
    public Vector StudentsRegisteredInCourse(int code) {
        // stores the list of students
        Vector<Student> amountofstudents = new Vector<>();
        for( Course courses:courseList){
            // if user input works, student is added to list
            if(courses.getNumber() == code){
                amountofstudents = courses.getList();
            }
        }
        return amountofstudents;
    }

    // prints student information on students in a specific course
    public void printStudentsRegisteredInCourse(int code){
        // creates the list of students
        Vector<Student>classList = StudentsRegisteredInCourse(code);
        // outputs the student's name and id
        for(Student info:classList){
            System.out.println(info.getName() + " " + info.getId());
        }
    }

    // finds the course with the highest number of students
    public Course largestCourse() {
        // creates list for holding students and course variables to  retrieve and store the list
        Vector<Student> ListofStudents;
        Course container, numOfStudents = null;
        int most = 0;
        // goes through the list of courses
        for(int i = 0; i < courseList.size(); i++){
            container = courseList.elementAt(i);
            ListofStudents = container.getList();
            // the current list becomes the max if greater than the previous largest list
            if(most <= ListofStudents.size()){
                most = ListofStudents.size();
                numOfStudents = container;
            }
        }
        // the course with the most students is returned
        return numOfStudents;
    }

    public String toString() {//outputs the name of the department,with the courses and the student registered in it.
        return name + ": " + String.valueOf(courseList.size()) + " courses, " + String.valueOf(registerList.size()) + " students";
    }
}
