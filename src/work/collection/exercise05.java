package work.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 创建一个List集合，里边有20组数据，
 * 在创建一个Map，把List中下标为0的作为map的key，下标为list.size()-1的为map的value，
 * 依次类推，最后在控制台打印出map所对应的key和value。
 */
public class exercise05 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            strList.add("a" + i);
        }

        /*
        0 n-1
        1 n-2
        i n-1-i
        ...
        i < n/2
         */
        Map<String, String> strMap = new HashMap<>();
        int n = strList.size();
        for (int i = 0; i < n / 2; i++) {
            strMap.put(strList.get(i), strList.get(n - 1 - i));
        }

        for (String key : strMap.keySet()) {
            System.out.println(key + ": " + strMap.get(key));
        }
    }
}
