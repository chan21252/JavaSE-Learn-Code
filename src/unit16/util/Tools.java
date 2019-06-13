package unit16.util;

import java.util.Calendar;
import java.util.Date;

public final class Tools {
    /**
     * 获取当前应用程序类路径的通用方法
     *
     * @return 类路径
     */
    public static String getClassPath() {
        return Tools.class.getClassLoader().getResource("").getPath();
    }

    /**
     * 根据年月日创建时间对象
     *
     * @param year  年
     * @param month 月
     * @param date  日
     * @return Date对象
     */
    public static Date toDate(int year, int month, int date) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, date);
        return cal.getTime();
    }
}
