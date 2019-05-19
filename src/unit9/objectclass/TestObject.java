package unit9.objectclass;

public class TestObject {
    public static void main(String[] args) {
        //Object user = new User();

        User user1 = new User();

        /* Object类常用方法 */

        /* toString方法 */
        System.out.println(user1.toString());

        /* equals方法 */
        User user2 = new User();
        User user3 = user1;
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));

        /* getClass方法，获得对象的运行时字节码对象Class实例 */
        Class cla = user1.getClass();
        System.out.println(cla.getName());
        Class cla2 = user2.getClass();
        System.out.println(cla == cla2);

        /* hashcode */
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
    }
}
