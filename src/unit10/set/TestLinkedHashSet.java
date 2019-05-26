package unit10.set;

import unit10.entity.Province;

import java.util.Scanner;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ProvinceManager pm = new ProvinceManager();

        System.out.println("请输入三个省份信息");
        for (int i = 0; i < 3; ) {
            System.out.println("请输入第 " + (++i) + " 个省份信息");
            System.out.println("请输入名称：");
            String name = in.next();
            System.out.println("请输入土地面积：");
            long area = in.nextLong();
            System.out.println("请输入是否是直辖市：0 普通省份，1 直辖市");
            int tag = in.nextInt();
            boolean general = (tag == 1);

            Province province = new Province();
            province.setName(name);
            province.setArea(area);
            province.setGeneral(general);

            pm.addProvince(province);
        }

        System.out.println("所有省份信息如下：");
        pm.displayAll();

        System.out.println("请输入查询省份的名称：");
        String proName = in.next();
        Province provinceFind = pm.findProvinceByName(proName);
        if (provinceFind == null) {
            System.out.println("未找到 " + proName + " 省份的信息");
        } else {
            System.out.println(provinceFind);
        }
    }
}
