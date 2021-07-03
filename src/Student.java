public class Student {
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return name + " has GPA " + gpa;
    }
}
