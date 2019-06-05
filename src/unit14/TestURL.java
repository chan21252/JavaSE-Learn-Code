package unit14;

import java.io.IOException;
import java.net.URL;

public class TestURL {
    public static void main(String[] args) {
        try {
            URL baiduUrl = new URL("https://www.baidu.com/");
            URL url2 = new URL("https", "localhost", 9090, "java.jpg");
            URL url3 = new URL(baiduUrl, "index.html");

            System.out.println("上下文： " + baiduUrl.getContent());
            System.out.println("请求的资源： " + baiduUrl.getFile());
            System.out.println("协议： " + baiduUrl.getProtocol());
            System.out.println("服务器： " + baiduUrl.getHost());
            System.out.println("端口： " + baiduUrl.getPort());
            System.out.println("默认端口： " + baiduUrl.getDefaultPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
