package unit12;

import unit12.entity.Employee;

import java.io.File;

public class TestSerializable {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("貂蝉");
        employee.setSex("女");
        employee.setAge(18);

        File file = new File("C:\\Users\\Administrator\\Desktop\\files1\\Employee.DATA");

        FileManager.javaSerializable(employee, file);
    }
}
