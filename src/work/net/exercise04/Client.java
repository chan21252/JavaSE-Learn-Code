package work.net.exercise04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 客户端发送数据，基于UDP
 */
public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte[] buffer2 = new byte[18];
        DatagramPacket dp2 = new DatagramPacket(buffer2, buffer2.length);

        try {
            DatagramSocket client = new DatagramSocket(9595);
            InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8888);
            client.connect(remoteAddress);

            if (client.isConnected()) {
                System.out.println("连接" + remoteAddress.getHostName() + " 成功");
                while (true) {
                    System.out.println("请输入消息");
                    String msg = in.next();
                    byte[] buffer = msg.getBytes();
                    DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
                    client.send(dp);
                    client.receive(dp2);
                    System.out.println(new String(dp2.getData()));
                }
            } else {
                System.out.println("连接失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
