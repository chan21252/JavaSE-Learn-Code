package unit16.util;

public final class Tools {
    /**
     * 获取当前应用程序类路径的通用方法
     *
     * @return 类路径
     */
    public static String getClassPath() {
        return Tools.class.getClassLoader().getResource("").getPath();
    }
}
