package unit14.clientsocket;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Socket client = null;       //客户端套接字
        client = new Socket();      //创建未连接的套接字对象

        InetSocketAddress address = new InetSocketAddress("localhost", 9595);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 9898);
        InputStream in = null;
        OutputStream out = null;
        DataInputStream din = null;
        DataOutputStream dout = null;

        try {
            client.bind(address);   //将套接字对象绑定到某个地址和端口
            System.out.println("是否绑定：" + client.isBound());
            System.out.println("是否连接：" + client.isConnected());

            /* 尝试连接到远程服务器 */
            if (!client.isConnected()) {
                client.connect(remoteAddress);

                //基于套接字实例获取输入输出流
                in = client.getInputStream();
                out = client.getOutputStream();
                din = new DataInputStream(in);
                dout = new DataOutputStream(out);

                while (true) {
                    System.out.println("输入信息");
                    String msg = scanner.next();
                    dout.writeUTF(msg);
                    String resMsg = din.readUTF();
                    System.out.println("服务器返回信息：" + resMsg);
                }
                //在不需要套接字时，关闭套接字，通常先关闭套接字的输入输出流
                //client.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
