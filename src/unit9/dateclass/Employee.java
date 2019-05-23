package unit9.dateclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private String sex;
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void showMe(){
        System.out.println(getName());
        System.out.println(getSex());
        //String dateStr = DateFormat.getDateInstance(DateFormat.FULL).format(birth);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateStr = sdf.format(birth);
        System.out.println(dateStr);
    }
}
