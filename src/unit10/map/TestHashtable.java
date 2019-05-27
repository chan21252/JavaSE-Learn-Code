package unit10.map;

import java.util.*;

public class TestHashtable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("k0", "鲁弗湟");
        ht.put("k1", "鲁息姑");
        ht.put("k2", "鲁允");
        //ht.put("k5", null);     //NullPointerException
        //ht.put(null, "鲁同");    //NullPointerException

        System.out.println(ht.size());

        /* 用Map代替实体类 */
        List stuList = new ArrayList();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Map stuMap = new HashMap();

            System.out.println("请输入第 " + (i + 1) + " 个学生信息");
            System.out.println("请输入学生姓名：");
            stuMap.put("name", in.next());
            System.out.println("请输入学生性别：");
            stuMap.put("sex", in.next());
            System.out.println("请输入学生年龄：");
            stuMap.put("age", in.nextInt());

            stuList.add(stuMap);
        }

        for (Object o : stuList) {
            Map stuMap = (Map) o;
            Set keySet = stuMap.keySet();
            for (Object k : keySet) {
                System.out.print(k + ": " + stuMap.get(k) + "\t");
            }
            System.out.println();
        }
    }
}
