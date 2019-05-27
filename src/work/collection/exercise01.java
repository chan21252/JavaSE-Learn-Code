package work.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 创建一个ArrayList集合，输入10个数，将数从大到小输出，从小到大输出，随机输出。
 */
public class exercise01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List myList = new ArrayList();  //创建集合

        /* 输入10个整数，添加到List */
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "整数：");
            int next = in.nextInt();
            myList.add(next);   //自动装箱
        }
        showList(myList);

        /* 排序并输出 */
        sortListByDesc(myList);
        sortListByAsc(myList);

        //引用参数传递，myList的顺序也被改变了
        showList(myList);

        /* 随机输出元素 */
        showElementRandom(myList);
        showElementRandom(myList);
        showElementRandom(myList);
        showElementRandom(myList);
        showElementRandom(myList);
    }

    /**
     * List元素从大到小排序
     *
     * @param listToSort 等待排序的List，元素只能是整数
     * @return 排序好的List
     */
    private static List sortListByDesc(List listToSort) {
        /*
        从第1个元素开始，依次和后面的每个元素比较，如果后面的元素>第1个元素，那么就调换顺序。
        然后下一个元素依次和后面每个元素比较，直到最后一个元素
         */
        for (int i = 0; i < listToSort.size(); i++) {
            for (int j = i; j < listToSort.size(); j++) {
                int currentEle = (Integer) listToSort.get(i);    //当前元素
                int compareEle = (Integer) listToSort.get(j);    //比较元素
                if (compareEle > currentEle) {
                    //Object tempObj = myList.get(i);
                    listToSort.set(i, compareEle);
                    listToSort.set(j, currentEle);
                }
            }
        }

        showList(listToSort);   //输出

        return listToSort;
    }

    /**
     * List元素从小到大排序
     *
     * @param listToSort 等待排序的List，元素只能是整数
     * @return 排序好的List
     */
    private static List sortListByAsc(List listToSort) {
        /*
        从第1个元素开始，依次和后面的每个元素比较，如果后面的元素<第1个元素，那么就调换顺序。
        然后下一个元素依次和后面每个元素比较，直到最后一个元素
         */
        for (int i = 0; i < listToSort.size(); i++) {
            for (int j = i; j < listToSort.size(); j++) {
                int currentEle = (Integer) listToSort.get(i);
                int compareEle = (Integer) listToSort.get(j);
                if (compareEle < currentEle) {
                    Object tempObj = listToSort.get(i);
                    listToSort.set(i, listToSort.get(j));
                    listToSort.set(j, tempObj);
                }
            }
        }

        showList(listToSort);   //输出

        return listToSort;
    }

    /**
     * 遍历List元素，并输出
     *
     * @param listToShow 等待遍历输出的List
     */
    private static void showList(List listToShow) {
        /* 遍历List */
        System.out.println("遍历List");
        for (Object o : listToShow) {
            int currentInt = (Integer) o;
            System.out.printf("%d\t", currentInt);
        }
        System.out.println();
    }

    private static void showElementRandom(List listToRand) {
        Random random = new Random();
        int index = random.nextInt(listToRand.size());  //随机生成一个索引
        System.out.println("随机输出：" + listToRand.get(index));
    }
}
