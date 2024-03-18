import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private String program;
    private String semester;
    private Map<String, Integer> courses;

    public Student(String name, String program, String semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new HashMap<>();
    }

    public void registerCourse(String course, int marks) {
        courses.put(course, marks);
    }

    public void getRegisteredCourses() {
        System.out.println("Registered Courses:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }

    public void getFailedCourses() {
        System.out.println("Courses with Marks Below 40:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 40) {
                System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "Computer Science", "Spring 2024");
        student1.registerCourse("Mathematics", 70);
        student1.registerCourse("Physics", 35);
        student1.registerCourse("Chemistry", 45);

        System.out.println("Student Name: " + student1.name);
        System.out.println("Program: " + student1.program);
        System.out.println("Semester: " + student1.semester);
        student1.getRegisteredCourses();
        student1.getFailedCourses();
    }
}
