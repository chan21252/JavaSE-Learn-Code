package unit9.objectclass;

import java.util.Objects;

public class User {
    private String name;
    private String password;

    public void display() {
        System.out.println("我的用户名是 " + name);
        System.out.println("我的密码是 " + password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 重写toString方法
     *
     * @return 对象的字符串表现形式
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

}
