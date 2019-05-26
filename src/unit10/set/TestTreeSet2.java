package unit10.set;

import unit10.entity.Goods;

import java.util.TreeSet;
import java.util.UUID;

public class TestTreeSet2 {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet(new GoodsSorted());

        Goods goods0 = new Goods();
        goods0.setName("剃须刀");
        goods0.setNumber(UUID.randomUUID().toString());
        goods0.setPrice(230.5);
        goods0.setQuantity(20000);

        Goods goods1 = new Goods();
        goods1.setName("洗发水");
        goods1.setNumber(UUID.randomUUID().toString());
        goods1.setPrice(78.8);
        goods1.setQuantity(8000);

        Goods goods2 = new Goods();
        goods2.setName("话筒");
        goods2.setNumber(UUID.randomUUID().toString());
        goods2.setPrice(999.5);
        goods2.setQuantity(100);

        Goods goods3 = new Goods();
        goods3.setName("矿泉水");
        goods3.setNumber(UUID.randomUUID().toString());
        goods3.setPrice(36);
        goods3.setQuantity(1000);

        tree.add(goods0);
        tree.add(goods1);
        tree.add(goods2);
        tree.add(goods3);

        for (Object o : tree) {
            System.out.println(o);
        }

        System.out.println(tree.last());
    }
}
