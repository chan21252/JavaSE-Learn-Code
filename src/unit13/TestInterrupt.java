package unit13;

public class TestInterrupt {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        ThreadTeacher teacher = new ThreadTeacher(classroom, "百事通");
        ThreadStudent student = new ThreadStudent(classroom, "小明");

        student.setPriority(Thread.MAX_PRIORITY);
        student.start();
        teacher.start();
    }
}
