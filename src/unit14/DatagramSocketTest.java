package unit14;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramSocketTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[18];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        byte[] buffer2 = "收到数据".getBytes();

        DatagramPacket dp2 = new DatagramPacket(buffer, buffer.length);
        try {
            DatagramSocket ds = new DatagramSocket(9595);
            ds.receive(dp);
            System.out.println(new String(dp.getData()));

            ds.send();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
