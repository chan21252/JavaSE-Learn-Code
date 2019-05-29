package unit11;

import java.sql.Connection;
import java.sql.SQLException;

public class TestException {
    public static void main(String[] args) {
        Computer com = new Computer();
        Connection conn = null;

        try {
            com.count(50, 2, null);
        } catch(SQLException | IllegalArgumentException e){
            System.out.println(e.getClass().getName());
        }
    }
}
