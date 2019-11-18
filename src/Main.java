import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Peter");
        student.setAge(18);
        student.setGender("M");
        student.setID(12345);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getID());
    }
}
