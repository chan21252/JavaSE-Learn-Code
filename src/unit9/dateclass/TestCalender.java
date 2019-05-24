package unit9.dateclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
    public static void main(String[] args) {

        //使用默认时区并指向当前系统时间创建一个Calender实例
        Calendar cal = Calendar.getInstance();

        /* 获取当前日历的日期时间 */
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;    //月份从0开始的
        int date = cal.get(Calendar.DATE);
        int day = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + "-" + month + "-" + date + " " + day);

        /* 获取当前日历对象对应的Date对象 */
        Date currentDate = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(currentDate));
    }
}
