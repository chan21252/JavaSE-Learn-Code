package unit10.map;

import unit10.entity.Department;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap depTree = new TreeMap(new Comparator() {
            //按照K降序排列，o1<o2，o1放在后面，返回1
            @Override
            public int compare(Object o1, Object o2) {
                Integer integerK1 = (Integer) o1;
                Integer integerK2 = (Integer) o2;

                if (integerK1 > integerK2) {
                    return -1;
                } else if (integerK1 < integerK2) {
                    return 1;
                }
                return 0;
            }
        });

        Department dep0 = new Department("dep100", "研发部", 100);
        Department dep1 = new Department("dep200", "市场部", 50);
        Department dep2 = new Department("dep300", "销售部", 200);
        Department dep3 = new Department("dep400", "人事部", 30);

        //存储数据
        depTree.put(new Integer(100), dep0);
        depTree.put(new Integer(50), dep1);
        depTree.put(new Integer(80), dep2);
        depTree.put(new Integer(10), dep3);

        Collection coll = depTree.values();
        for (Object v : coll) {
            Department depTemp = (Department) v;
            System.out.println(v);
        }
    }
}
