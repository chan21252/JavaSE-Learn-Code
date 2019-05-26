package unit10.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();       //创建一个采用默认树形自然排序的TreeSet对象

        tree.add(new Integer(50));
        tree.add(new Integer(200));
        tree.add(new Integer(21));
        tree.add(new Integer(28));
        tree.add(new Integer(5000));

        for (Object o : tree) {
            System.out.println(Integer.parseInt(o.toString()));
        }

        Iterator it = tree.descendingIterator();
        while (it.hasNext()) {
            System.out.println(((Integer) it.next()).intValue());
        }
    }
}
