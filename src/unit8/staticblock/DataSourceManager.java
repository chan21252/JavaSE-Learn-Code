package unit8.staticblock;

public class DataSourceManager {
    private static final String URL;
    private static final String DRIVER;
    private static final String USERNAME;
    private static final String PASSWORD;

    static DataSourceManager self;

    static {
        class InnerClass {
            public void printMessage() {
                System.out.println("静态代码块的内部局部类");
            }
        }
        URL = "jdbc:mysql://localhost:3306/test";
        DRIVER = "com.mysql.jdbc.Driver";
        USERNAME = "root";
        PASSWORD = "123";

        if (self == null) {
            newInstanceofDataSourceManager();
            InnerClass inner = new InnerClass();
            inner.printMessage();
        }
    }

    private DataSourceManager() {

    }

    public static String getURL() {
        return URL;
    }

    public static String getDRIVER() {
        return DRIVER;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    private static void newInstanceofDataSourceManager() {
        self = new DataSourceManager();
    }
}
