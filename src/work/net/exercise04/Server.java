package work.net.exercise04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Server {
    public static void main(String[] args) {

        byte[] bufferResp = "已经收到消息".getBytes();
        DatagramPacket dpResp = new DatagramPacket(bufferResp, bufferResp.length);
        try {
            dpResp.setAddress(InetAddress.getByName("localhost"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("Host名称错误");
        }

        dpResp.setPort(9595);

        try {
            DatagramSocket server = new DatagramSocket(8888);
            while (true) {
                byte[] buffer = new byte[512];
                DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
                server.receive(dp);

                System.out.println(new String(dp.getData()));
                server.send(dpResp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
