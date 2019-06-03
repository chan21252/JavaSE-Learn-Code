package work.io;

import java.io.File;

/**
 * 从网络下载一个图片到电脑的D盘
 */
public class Exercise13 {
    public static void main(String[] args) {
        String imageUrl = "http://issuecdn.baidupcs.com/issue/netdisk/yunguanjia/BaiduYunGuanjia_6.7.4.exe";
        File downloadDir = new File("D:/ss/");
        String fileName = "BaiDuYun";

        FileManager.downloadFileByUrl(imageUrl, downloadDir, fileName);
    }
}
