import java.util.Vector;
public class Student extends Person {

    private String id; //initializes the student name
    private String name;//initializes the id
    private Vector<Course> courses;//initializes all the courses the student is registered in

    public Student(String stdName, String stdId) {
        //initializes the vectors
        this.name = stdName;
        this.id = stdId;
        this.courses = new Vector<Course>();
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for id
    public String getId() {
        return id;
    }

    // checks if the student is registered in a course
    public boolean isRegisteredInCourse(Course course){
        return this.courses.contains(course);
    }

    // the student is added to a selected course if not enrolled
        public void registerFor(Course course){
        if(isRegisteredInCourse(course) == false){
            this.courses.add(course);
        }
    }


    public String toString() {

        // name of a student who is not registered in any classes just has their name return
        if(this.courses.size() == 0) {
            return this.id + " " + this.name;
        }

        else{
            //Otherwise the list of courses that they're registered in is stored
            String List = "";

            //adds the student and their code to the list
            for(Course course:this.courses){
                List += course.getCode() + " " + course.getNumber() + "  ";
            }
            return this.id + "  " + this.name + "\n" + " Registered courses: " + "\n " + List + " ";
        }
    }
}
