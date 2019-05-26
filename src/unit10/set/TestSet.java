package unit10.set;

import unit10.entity.Goods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class TestSet {
    public static void main(String[] args) {
        Set goodsSet = new HashSet(16, 0.75f);      //指定初始容量

        Goods goods0 = new Goods();
        goods0.setName("肥皂");
        goods0.setNumber(UUID.randomUUID().toString());
        goods0.setPrice(3.5);
        goods0.setQuantity(20000);

        Goods goods1 = new Goods();
        goods1.setName("洗发水");
        goods1.setNumber(UUID.randomUUID().toString());
        goods1.setPrice(28.8);
        goods1.setQuantity(8000);

        Goods goods2 = new Goods();
        goods2.setName("运动鞋");
        goods2.setNumber(UUID.randomUUID().toString());
        goods2.setPrice(153.5);
        goods2.setQuantity(1500);

        Goods goods3 = goods0;
        goods3.setName("羽毛球");
        goods3.setPrice(1);

        goodsSet.add(goods0);
        goodsSet.add(goods1);
        goodsSet.add(goods2);
        goodsSet.add(goods3);

        Iterator iterator = goodsSet.iterator();
        while (iterator.hasNext()) {
            Goods g = (Goods) iterator.next();
            System.out.println(g);
        }

        for (Object o : goodsSet) {
            System.out.println(o);
        }

        /*
        将Set中所有元素封装为Object数组返回
         */
        Object[] Objs = goodsSet.toArray();
        for (int i = 0; i < Objs.length; i++) {
            System.out.println(Objs[i]);
        }
    }
}
