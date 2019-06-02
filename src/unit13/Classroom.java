package unit13;

public class Classroom implements Runnable {

    private ThreadStudent student = null;   //执行任务的学生线程
    private ThreadTeacher teacher = null;   //执行任务的老师线程

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        //当前线程是学生线程，就休眠
        if (current instanceof ThreadStudent) {
            student = (ThreadStudent) current;
            System.out.println(student.getName() + "上课睡觉");
            try {
                Thread.sleep(1000 * 60 * 60);
            } catch (InterruptedException e) {
                System.out.println(student.getName() + "被老师叫醒了，继续听课");
                //e.printStackTrace();
            }
        }

        //当前线程是学生线程，就打断休眠
        if (current instanceof ThreadTeacher) {
            System.out.println(current.getName() + "正在上课");
            teacher = (ThreadTeacher) current;
            for (int i = 0; i < 3; i++) {
                System.out.println(current.getName() + "老师喊：\"上课了，不要睡觉！\"");
                if (student != null) {
                    teacher.interruptSleep(student);
                }
            }
        }
    }
}
