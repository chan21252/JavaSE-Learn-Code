package unit14;

import java.io.IOException;
import java.net.*;

public class TestClient {
    public static void main(String[] args) {
        byte[] buffer = new String("我的名字是火云邪神").getBytes();
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

        byte[] buffer2 = new byte[60];
        DatagramPacket dp2 = new DatagramPacket(buffer2, buffer2.length);
        SocketAddress address = new InetSocketAddress("localhost", 9595);

        try {
            DatagramSocket ds = new DatagramSocket(8888);
            ds.connect(address);
            System.out.println(ds.isConnected());
            ds.disconnect();
            System.out.println(ds.isConnected());

            /* 向目的地发送数据报包 */
            ds.send(dp);

            /* 接受数据报包 */
            ds.receive(dp2);

            /* 获取数据报包 */
            System.out.println("返回的数据报信息是 " + new String(dp2.getData()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
