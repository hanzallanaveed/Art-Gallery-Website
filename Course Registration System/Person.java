public class Person {
    // initializes the name
    private String name;

    // constructors for the name
    public Person(String initialName){
        this.name = initialName;
    }

    public Person(){
        // TODO Auto-generated constructor stub
    }

    //  gets the name
    public String getName(){
        return name;
    }

    // uses the entire name as the name
    public void setName(String fullName){
        this.name = fullName;
    }

    // returns student's name
    public String toString(){
        return "Person = " + this.name;

    }



}