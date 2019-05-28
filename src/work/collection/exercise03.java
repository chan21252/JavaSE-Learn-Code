package work.collection;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 创建一个HashMap，里边存有key：username，value:password,的用户密码信息，
 * 从控制台输入一个用户和密码，程序在后台判断用户名在map中是否存在，
 * 如果不存在，就提示用户名错误，用户正确，在判断当前用户名对应的密码是否和输入的一致，如果一致就提示用户密码正确.
 */
public class exercise03 {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("admin", "123456");

        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = in.next();
        System.out.println("请输入密码：");
        String password = in.next();

        if (userMap.containsKey(username)) {
            if (password.equals(userMap.get(username))) {
                System.out.println("用户名密码正确");
            } else {
                System.out.println("密码错误");
            }
        } else {
            System.out.println("用户名错误");
        }
    }
}
