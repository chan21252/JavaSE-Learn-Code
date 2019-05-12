package unit6;

import unit6.entity.Book;
import unit6.entity.Student;

public class TestMethod {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("令狐冲");
        stu.setAge(18);
        stu.showSelf();

        Book book = new Book("三国演义", 800);
        stu.readBook(book);
        System.out.println(book.getTitle());
        System.out.println(book.getPageSize());
    }
}
