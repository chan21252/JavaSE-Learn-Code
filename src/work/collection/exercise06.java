package work.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 创建一个Map集合，里边有10组数据，假如key为1到10，value为11到20，
 * 从控制台接受1到20之间的数，程序后台判断map中key和value有没有对应的，
 * 如果有提示当前数字为key，对应的值是多少，如果是值匹配上了，提示匹配到值为xx，对应的key为yy。
 */
public class exercise06 {
    public static void main(String[] args) {
        //创建Map
        Map<Integer, Integer> map = new HashMap<>();

        //添加元素
        for (int i = 1; i <= 10; i++) {
            map.put(i, i + 10);
        }

        //接受输入
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int toTest = in.nextInt();

        //匹配
        if (map.containsKey(toTest)) {
            System.out.println("key匹配，匹配到value为 " + map.get(toTest));
        }

        if (map.containsValue(toTest)) {
            //用entrySet遍历，找到value==toTest的entry，获取key
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (toTest == entry.getValue()) {
                    int key = entry.getKey();
                    System.out.println("value匹配，匹配到key为 " + key + ", 值为 " + map.get(key));
                }
            }
        }
    }
}
