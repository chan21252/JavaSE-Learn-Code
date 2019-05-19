package unit8.innerclass;

public class Test {
    public static void main(String[] args) {
        /**
         * 使用匿名类对象
         */
        IValidata validata = new IValidata() {
            @Override
            public boolean validataPassword(String username, String password) {
                if (username != null && "king123".equals(username) &&
                        password != null && "123456".equals(password)) {
                    return YES;
                } else {
                    return NO;
                }
            }
        };

        String username = "king123";
        String password = "123456";

        System.out.println(validata(username, password, validata));
    }

    public static boolean validata(String username, String password, IValidata validata) {
        return validata.validataPassword(username, password);
    }
}
