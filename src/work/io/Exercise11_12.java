package work.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 11、在控制台输入2个mp3的路径，程序接受到后对两个mp3进行合成。合成后输出到D:/merge.mp3。
 * 12、对上面题目进行稍加改动，从控制台接受至少两个mp3路径，输入q退出，程序对这些路径的mp3进行合成
 */
public class Exercise11_12 {
    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        File music1 = new File("D:\\CloudMusic\\周迅 - 爱恨恢恢.mp3");
        File music2 = new File("D:\\CloudMusic\\Various Artists - 克罗地亚第二狂想曲.mp3");
        File music3 = new File("D:\\CloudMusic\\ハンバート ハンバート - 今晩はお月さん.mp3");
        fileList.add(music2);
        fileList.add(music1);
        fileList.add(music3);

        File mergeMusic1 = new File("D:\\CloudMusic\\merge.mp3");
        FileManager.mergeFiles(fileList, mergeMusic1);

        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");  //解决输入的文件路径存在空格的问题，输入分隔符使用换行符
        List<File> musicList = new ArrayList<>();
        int musicNum = 0;

        while (true) {
            System.out.println("请输入下一个歌曲的路径,按q退出：");
            String musicPath = in.next();
            if ("q".equals(musicPath)) {
                if (musicNum > 2) {
                    break;
                } else {
                    System.out.println("歌曲至少要2个，现在只有 " + musicNum + " 个");
                    continue;
                }
            }

            File musicTemp = new File(musicPath);
            musicList.add(musicTemp);
            musicNum++;
        }

        File mergeMusic2 = new File("D:\\CloudMusic\\merge2.mp3");
        FileManager.mergeFiles(musicList, mergeMusic2);
    }
}
