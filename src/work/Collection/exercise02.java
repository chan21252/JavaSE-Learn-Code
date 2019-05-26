package work.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 已知有两个容器List，第一个List装有【小编,小王】,第二个容器装有【95分，94分】，
 * 请把第二个容器的94分改成95分，通过迭代器在控制打印出：
 * 小编：95分
 * 小王：95分
 */
public class exercise02 {
    public static void main(String[] args) {
        //创建List对象
        List stuList = new ArrayList();
        List scoreList = new ArrayList();

        //添加元素
        stuList.add("小编");
        stuList.add("小王");
        scoreList.add(95);
        scoreList.add(94);

        //修改元素
        scoreList.set(1, 95);

        //获取迭代器
        Iterator it = stuList.iterator();
        Iterator it2 = scoreList.iterator();

        //遍历
        while (it.hasNext() && it2.hasNext()) {
            System.out.println(it.next() + "：" + it2.next());
        }
    }
}
