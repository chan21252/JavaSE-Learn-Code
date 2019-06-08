package work.net.exercise03;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        /*
        1. 创建socket对象，绑定到hostname，端口
        2. 连接到远程服务端socket
        3. 循环向服务器发送消息和接收服务器返回消息
        4. 关闭资源
         */
        Scanner scanner = new Scanner(System.in);

        InetSocketAddress clientAddress = new InetSocketAddress("localhost", 9090);
        InetSocketAddress serverAddress = new InetSocketAddress("localhost", 8888);

        Socket client = null;
        InputStream in = null;
        OutputStream out = null;
        DataInputStream din = null;
        DataOutputStream dout = null;

        try {
            client = new Socket();
            client.bind(clientAddress);

            if (!client.isBound()) {
                System.out.println("绑定失败");
                return;
            }

            if (!client.isConnected()) {
                client.connect(serverAddress);
            }

            if (client.isConnected()) {
                System.out.println("client已连接到" + serverAddress.getHostName() + ":" + serverAddress.getPort());
                /* 发送字符 */
                /*
                while (true) {
                    System.out.println("请输入信息：");
                    String sendMsg = scanner.next();
                    out = client.getOutputStream();
                    dout = new DataOutputStream(out);
                    dout.writeUTF(sendMsg);

                    in = client.getInputStream();
                    din = new DataInputStream(in);
                    String respMsg = din.readUTF();
                    System.out.println("返回信息： " + respMsg);
                }
                */

                /* 发送文件 */
                File imageFile = new File("D:/ss/send.jpg");
                if (imageFile.exists()) {
                    //创建图片对象
                    Image sendImage = new Image();
                    sendImage.setName("send.jpg");
                    //创建存放图片字节内容的集合
                    List<byte[]> bufferList = new ArrayList<>();

                    //文件对象创建输入流
                    in = new FileInputStream(imageFile);
                    //socket创建输出流，创建对象输出流
                    out = client.getOutputStream();
                    ObjectOutputStream objOut = new ObjectOutputStream(out);

                    //读取文件输入流内容，写入到对象输入流
                    byte[] buffer = new byte[1024];
                    int count = 0;
                    while ((count = in.read(buffer, 0, buffer.length)) != -1) {
                        //处理最后一个buffer长度不到1024的情况
                        byte[] bufferRead = new byte[count];
                        System.arraycopy(buffer, 0, bufferRead, 0, bufferRead.length);
                        bufferList.add(bufferRead);
                    }
                    sendImage.setBufferList(bufferList);
                    objOut.writeObject(sendImage);
                    System.out.println("文件发送完毕");
                } else {
                    System.out.println("文件不存在");
                }
            } else {
                System.out.println("连接失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dout != null) dout.close();
                if (din != null) din.close();
                if (in != null) in.close();
                if (out != null) out.close();
                if (client != null) client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
