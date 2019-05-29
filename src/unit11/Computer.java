package unit11;

import java.sql.Connection;
import java.sql.SQLException;

public class Computer {
    /**
     * 使用throws关键字声明异常
     * 在满足条件时，使用throw抛出异常
     * 抛出异常实例必须时方法已经声明的异常类型
     * @param n 被除数
     * @param m 除数
     * @return 商
     * @throws Exception 异常
     */
    public double count(double n, double m, Connection conn) throws SQLException,IllegalArgumentException{
        if (m == 0){
            IllegalArgumentException e = new IllegalArgumentException("除数不能为0");
            throw e;
        }

        if (conn == null){
            throw new SQLException("conn为null");
        }
        return n / m;
    }
}
