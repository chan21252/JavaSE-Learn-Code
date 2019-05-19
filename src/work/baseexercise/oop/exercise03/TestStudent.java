package work.baseexercise.oop.exercise03;

import java.util.Random;

public class TestStudent {
    private static Random random = new Random();

    public static void main(String[] args) {
        Student[] studentArr = new Student[5];

        studentArr[0] = new EnglishStudent("2019001", "小明", "男", 18, getRandomScore(), getRandomScore(), getRandomScore());
        studentArr[1] = new EnglishStudent("2019002", "小王", "女", 19, getRandomScore(), getRandomScore(), getRandomScore());
        studentArr[2] = new ComputerStudent("2019003", "小李", "男", 22, getRandomScore(), getRandomScore(), getRandomScore(), getRandomScore());
        studentArr[3] = new ComputerStudent("2019004", "小张", "女", 19, getRandomScore(), getRandomScore(), getRandomScore(), getRandomScore());
        studentArr[4] = new LiteratureStudent("2019005", "小赵", "女", 23, getRandomScore(), getRandomScore(), getRandomScore(), getRandomScore());

        for (Student student : studentArr) {
            System.out.printf("学号：%s\t姓名：%s\t性别：%s\t年龄：%d\t综合成绩：%.2f\n",
                    student.getId(), student.getName(), student.getGender(), student.getAge(), student.calculateScore());
        }
    }

    private static int getRandomScore() {
        return random.nextInt(100);
    }
}
