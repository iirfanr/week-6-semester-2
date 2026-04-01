package JavaProblems;

public class Student {
    private int id;
    private String name;

    public Student(int i, String n){
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student{id=" +id+", name='"+name+"'}";
    }
}
