package unit14.serversocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        InputStream in = null;
        OutputStream out = null;
        DataInputStream din = null;
        DataOutputStream dout = null;

        try {
            serverSocket = new ServerSocket(9898);
            Socket client = null;

            //循环等待客户端socket
            while (true) {
                System.out.println("等待链接......");
                client = serverSocket.accept();
                System.out.println("链接成功");
                in = client.getInputStream();
                din = new DataInputStream(in);
                out = client.getOutputStream();
                dout = new DataOutputStream(out);

                String msg = din.readUTF();
                System.out.println("客户端信息：" + msg);
                dout.writeUTF("你好！" + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
