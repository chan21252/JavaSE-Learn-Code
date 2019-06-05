package unit14;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress add0 = InetAddress.getLocalHost();
            System.out.println("本机名称是" + add0.getHostName());
            System.out.println("本机地址是" + add0.getHostAddress());

            InetAddress baiduIp = InetAddress.getByName("www.baidu.com");
            System.out.println(baiduIp.getHostName());
            System.out.println(baiduIp.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        InetSocketAddress isa = new InetSocketAddress("localhost", 80);
        System.out.println(isa.getHostName());
        System.out.println(isa.getHostString());
        System.out.println(isa.getPort());
        System.out.println(isa.getAddress().getHostAddress());
    }
}
