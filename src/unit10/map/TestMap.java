package unit10.map;

import unit10.entity.Car;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestMap {
    public static void main(String[] args) throws Exception {
        Map carMap = new HashMap();

        Car car0 = new Car();
        car0.setBrand("哈弗");
        car0.setProductDate(new Date());
        car0.setPower(4);
        car0.setSpeed(175);

        Car car1 = new Car();
        car1.setBrand("奔驰");
        car1.setProductDate(new Date());
        car1.setPower(6);
        car1.setSpeed(205);

        Car car2 = new Car();
        car2.setBrand("传祺");
        car2.setProductDate(new Date());
        car2.setPower(5);
        car2.setSpeed(215);

        Car car3 = new Car();
        car3.setBrand("雷诺");
        car3.setProductDate(new Date());
        car3.setPower(7);
        car3.setSpeed(250);

        Car car4 = new Car();
        car4.setBrand("法拉利");
        car4.setProductDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2019-05-26 00:00:00"));
        car4.setPower(12);
        car4.setSpeed(290);

        //put添加对象
        carMap.put("k1", car0);
        carMap.put("k2", car1);
        carMap.put("k3", car2);
        carMap.put("k4", car3);
        carMap.put("k4", car4);

        System.out.println("集合大小是 " + carMap.size());

        //使用get方法按照给定的key查询值对象
        Object obj = carMap.get("k4");
        if (obj != null) {
            Car target = (Car) obj;
            System.out.println(target);
        }

        /* 获取Map集合的所有key */
        Set keySet = carMap.keySet();

        for (Object k : keySet) {
            Car temp = (Car) carMap.get(k);
            System.out.println(temp);
        }

        /* 获取所有值对象 */
        Collection coll = carMap.values();
        for (Object v : coll) {
            System.out.println(((Car) v).getBrand());
        }

        /* 判断是否包含某个给定的key */
        System.out.println("是否包含k4键： " + carMap.containsKey("k4"));

        /* 移除键值对象 */
        if (carMap.containsKey("k3")) {
            Object o = carMap.remove("k3");
            System.out.println("移除： " + o);
        }

        System.out.println(carMap.get("k3"));
        System.out.println(carMap.size());

    }
}
