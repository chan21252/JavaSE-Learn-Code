package work.net.exercise03;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Iterator;

public class Server {
    public static void main(String[] args) {
        /*
        1. 创建一个ServerSocket
        2. 绑定到端口
        3. 接受连接到服务器socket的链接
        4. 循环处理接收到的客户端socket输入流
        5. 关闭服务器socket
         */

        ServerSocket server = null;
        InputStream in = null;
        OutputStream out = null;
        DataInputStream din = null;
        DataOutputStream dout = null;
        try {
            /* 创建套接字对象，绑定到端口 */
            server = new ServerSocket();
            SocketAddress address = new InetSocketAddress("localhost", 8888);
            server.bind(address);


            /* 等待接收client连接 */
            System.out.println("等待链接...");
            Socket client = server.accept();

            /* 循环处理连接信息 */
            /*while (true) {
             *//* 连接的客户端socket输入流 *//*
                in = client.getInputStream();
                din = new DataInputStream(in);
                String msg = din.readUTF();
                System.out.println("接收到信息： " + msg);

                *//* 连接的客户端socket输出流 *//*
                out = client.getOutputStream();
                dout = new DataOutputStream(out);
                dout.writeUTF(msg);
            }*/

            System.out.println("开始接收文件");
            in = client.getInputStream();
            ObjectInputStream objIn = new ObjectInputStream(in);
            Image receiveImage = (Image) objIn.readObject();
            receiveImage.setName("receive.jpg");

            File file = new File("D:/ss/" + receiveImage.getName());
            out = new FileOutputStream(file);

            for (byte[] buffer : receiveImage.getBufferList()) {
                out.write(buffer, 0, buffer.length);
            }
            System.out.println("文件接收完毕");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dout != null) dout.close();
                if (din != null) din.close();
                if (in != null) in.close();
                if (out != null) out.close();
                if (server != null) server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
