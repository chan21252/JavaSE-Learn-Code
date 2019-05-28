package unit10.generic;

import unit10.entity.Department;
import unit10.imp.DepartmentDaoImp;

public class TestGenericInterface {
    public static void main(String[] args) {
        Department dep = new Department("dep100", "设计部", 100);

        DepartmentDaoImp<Department> depDao = new DepartmentDaoImp<>();
        depDao.save(dep);
    }
}
