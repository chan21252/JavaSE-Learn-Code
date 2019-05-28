package unit10.imp;

import unit10.entity.Department;
import unit10.interfaces.BaseDao;

public class DepartmentDaoImp<T> implements BaseDao<T> {
    @Override
    public void save(T t) {
        if (t != null){
            Department dep = (Department) t;
            System.out.println(dep.getName() + " 已保存");
        }
    }
}
