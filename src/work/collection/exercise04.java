package work.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 有两个list集合，
 * l1数据有1，2，3，4 l2数据有 2，3，4，5，
 * 将两个集合中重复的数据移除，并且把不重复的添加到第三个l3集合里边。
 */
public class exercise04 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();

        for (int i = 1; i < 5; i++) {
            list1.add(i);
            list2.add(i + 1);
        }

        /*
        list1，list2转HashSet
        用Collection的removeAll()方法，实现HashSet去重
        去重后的Set添加到List
        */

        //创建HashSet对象
        Set hashSet1 = new HashSet();
        Set hashSet1_copy = new HashSet();
        Set hashSet2 = new HashSet();

        //list对象，接受去重后的HashSet
        List list1Remove = new ArrayList();
        List list2Remove = new ArrayList();

        //List元素添加到HashSet
        for (Object o : list1) {
            hashSet1.add(o);
            hashSet1_copy.add(o);
        }
        for (Object o : list2) {
            hashSet2.add(o);
        }

        //去重，去重后的HashSet元素添加到List
        hashSet1.removeAll(hashSet2);
        list1Remove.addAll(hashSet1);
        hashSet2.removeAll(hashSet1_copy);
        list2Remove.addAll(hashSet2);

        //不重复的元素添加到list3
        list3.addAll(list1Remove);
        list3.addAll(list2Remove);

        //输出去重后的List
        for (Object o : list1Remove) {
            int data = (Integer) o;
            System.out.printf("%d\t", data);
        }
        System.out.println();

        for (Object o : list2Remove) {
            int data = (Integer) o;
            System.out.printf("%d\t", data);
        }
        System.out.println();

        for (Object o : list3) {
            int data = (Integer) o;
            System.out.printf("%d\t", data);
        }
        System.out.println();

        /*
        番外：
        重复的元素添加到list3
        用一个Set接受list1,2的元素，得到所有元素的集合
        然后分别找出在set中，且在list1和list2中元素
         */
        List list4 = new ArrayList();
        Set allSet = new HashSet();
        for (Object o : list1) {
            allSet.add(o);
        }
        for (Object o : list2) {
            allSet.add(o);
        }

        for (Object o : allSet) {
            if (list1.contains(o) && list2.contains(o)) {
                list4.add(o);
            }
        }

        for (Object o : list4) {
            int data = (Integer) o;
            System.out.printf("%d\t", data);
        }
        System.out.println();



        /*
        错误做法：
        ArrayList线程不安全，List保证其遍历时不被修改，采用的是用一个计数器的机制。
        在开始遍历前，先记录当前的modCount值，而后每次访问下一个元素之前，都会检查下modCount值是否变化，如果有变化，说明List的长度有变化。
        一旦长度有变化，就会抛出ConcurrentModificationException异常。

        ArrayList$Itr.next()调用checkForComodification()方法
        checkForComodification()方法，if(modCount != expectedModCount)，抛出 ConcurrentModificationException

        ArrayList类的boolean remove(Object o)方法，调用fastRemove(int index)方法
        fastRemove()方法中，modCount++;

        因此，modCount != expectedModCount，抛出异常
         */
        /*for (Object o : list1){
            int data = (Integer)o;
            System.out.println(data);
            if (list2.contains(data)){
                list1.remove(o);
                list2.remove(o);
            }else {
                list3.add(o);
            }
        }*/

    }
}
