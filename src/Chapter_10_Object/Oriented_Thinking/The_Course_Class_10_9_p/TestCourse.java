package Chapter_10_Object.Oriented_Thinking.The_Course_Class_10_9_p;

public class TestCourse {
    public static void main(String[] args) {

        Course course1 = new Course("course1"); // laver en Course vha. constructoren fra Course Klassen

        course1.addStudent("lars"); //Tilføjer student
        course1.addStudent("Michael"); //Tilføjer student
        course1.addStudent("Niels"); //Tilføjer student


        course1.dropStudent("Niels"); //Fjerner student




        System.out.println(course1.getCourseName() + " har " + course1.getNumberOfStudents() + " studerende:"); //Tekst


        //Udskriver hvem der er i arrayet:
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }

    }
}