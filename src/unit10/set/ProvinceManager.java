package unit10.set;

import unit10.entity.Province;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ProvinceManager {

    private LinkedHashSet provinceSet;

    public ProvinceManager() {
        if (provinceSet == null) {
            provinceSet = new LinkedHashSet();
        }
    }

    /**
     * 添加省份到集合
     *
     * @param province 省份
     */
    public void addProvince(Province province) {
        provinceSet.add(province);
    }

    /**
     * 根据名字查询省份信息
     *
     * @param name 省份名字
     * @return 省份对象
     */
    public Province findProvinceByName(String name) {
        for (Object o : provinceSet) {
            if (name.equals(((Province) o).getName())) {
                return (Province) o;
            }
        }

        return null;
    }

    /**
     * 显示所有省份信息
     */
    public void displayAll() {
        for (Object o : provinceSet) {
            System.out.println(o);
        }
    }
}
