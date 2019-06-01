package work.io;

import java.io.File;
import java.net.URI;

/**
 * 从网络下载一个图片到电脑的D盘
 */
public class Exercise13 {
    public static void main(String[] args) {
        String imageUrl = "https://dldir1.qq.com/qqfile/qq/PCQQ9.1.3/25326/QQ9.1.3.25326.exe";
        File downloadDir = new File("D:/ss/");
        String fileName = "QQ";

        FileManager.downloadFileByUrl(imageUrl, downloadDir, fileName);
    }
}
