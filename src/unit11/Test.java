package unit11;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        //countArrayLength(-1);
        Computer com = new Computer();
        Connection conn = null;
        try {
            double res = com.count(78, 2, conn);
            System.out.println(res);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("回收资源");
            try {
                if (conn != null){  //避免空指针异常
                    conn.close();
                    System.out.println("关闭连接");
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static int countArrayLength(int length){
        int[] nums = new int[length];
        return nums.length;
    }
}
