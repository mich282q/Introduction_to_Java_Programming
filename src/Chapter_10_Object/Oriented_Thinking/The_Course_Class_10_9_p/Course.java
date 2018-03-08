package Chapter_10_Object.Oriented_Thinking.The_Course_Class_10_9_p;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    //Constructor som sætter navnert på course
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) { // Metoder som tilføjer en student til array
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() { //Metoder som fortæller hvem der er i array
        return students;
    }

    public int getNumberOfStudents() { //Metoder som fortæller hvor mange der er i array
        return numberOfStudents;
    }

    public String getCourseName() { //Metoder som fortæller navnet på arrayet
        return courseName;
    }

    public void dropStudent(String student) { //fjerner en student
        students[numberOfStudents] = student;
        numberOfStudents--;
    }
    public void clear(){ //fjerner alle students
        numberOfStudents = 0;
    }
}