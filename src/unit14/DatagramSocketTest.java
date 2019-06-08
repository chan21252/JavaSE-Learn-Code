package unit14;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocketTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[18];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

        byte[] buffer2 = "收到数据".getBytes();
        DatagramPacket dp2 = new DatagramPacket(buffer2, buffer2.length);

        try {
            DatagramSocket ds = new DatagramSocket(9595);
            ds.receive(dp);
            System.out.println(new String(dp.getData()));

            dp2.setAddress(InetAddress.getByName("localhost"));
            dp2.setPort(8888);
            ds.send(dp2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
