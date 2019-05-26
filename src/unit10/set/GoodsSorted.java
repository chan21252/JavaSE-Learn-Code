package unit10.set;

import unit10.entity.Goods;

import java.util.Comparator;

public class GoodsSorted implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Goods g1 = (Goods) o1;
        Goods g2 = (Goods) o2;

        System.out.println("调用排序方法" + g1.getName() + " 比 " + g2.getName());

        if (g1.getPrice() > g2.getPrice())
            return -1;
        else if (g1.getPrice() < g2.getPrice())
            return 1;

        return 0;
    }

}
