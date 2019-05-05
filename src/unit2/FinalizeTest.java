package unit2;

public class FinalizeTest {
    public static void main(String[] args) throws Throwable {
        Student s1 = new Student("xiaoming");
        System.out.println(s1.getName());
        s1 = null;
        System.out.println(new Student("xiaowang").getName());

        System.gc();    //强制进行垃圾回收
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() throws Throwable {
        finalize();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象进入垃圾回收前，执行finalize");
        super.finalize();
    }
}
