package unit10.generic;

import unit10.entity.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型使用?通配符
 */
public class TestGenericWilccard {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        List<Number> numList = new ArrayList<Number>();

        intList.add(100);
        intList.add(200);

        numList.add(6.66);
        numList.add(666.6);
        numList.add(8888.8);

        //numList = intList;    //错误，泛型没有继承关系

        List<Employee> empList = new ArrayList<Employee>();
        Class intListClass = intList.getClass();
        Class empListClass = empList.getClass();
        System.out.println(intListClass == empListClass);   //是一样的类型


        List<?> list = intList;     //动态确定类型
        for (Object o : list) {
            System.out.println(((Integer)o).intValue());
        }

        list = numList;
        for (Object o : list) {
            System.out.println(((Number)o).doubleValue());
        }
    }
}
