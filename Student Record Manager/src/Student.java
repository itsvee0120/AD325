public class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setID(int id){
        this.id= id;
    }

    public int getID(){
        return id;
    }

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    public double getGPA(){
        return gpa;
    }

    @Override
    public String toString(){
        return "ID: " + id + " Name: " + name + " GPA: " + gpa;
    }

}
