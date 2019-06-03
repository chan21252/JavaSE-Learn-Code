package work.io;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;

/**
 * 文件IO操作类
 *
 * @author CuiCan
 */
public class FileManager {
    /**
     * 创建文件夹
     *
     * @param dir 目录文件对象
     * @return 是否创建成功
     */
    public static boolean createDir(File dir) {
        if (!dir.exists()) {
            boolean res = dir.mkdirs();
            if (res) {
                System.out.println("创建成功");
                return true;
            } else {
                System.out.println("创建失败");
                return false;
            }
        }
        System.out.println("文件夹已存在");
        return false;
    }

    /**
     * 字符输入流写入字符串到文件
     *
     * @param file    要写入的文件对象
     * @param content 要写入的字符串内容
     */
    public static void writeChartoFile(File file, String content) {
        Writer writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(file);
            bw = new BufferedWriter(writer);
            char[] chs = content.toCharArray();
            bw.write(chs);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字符输入流从文件中读取字符串
     *
     * @param file 要读取文件对象
     * @return 读取到的字符串
     */
    public static String readCharFromFile(File file) {
        if (!file.exists()) {
            System.out.println("文件不存在");
            return null;
        }

        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            char[] chs = new char[512];
            int count;
            StringBuilder sb = new StringBuilder();
            while ((count = br.read(chs, 0, chs.length)) != -1) {
                String s = new String(chs, 0, count);
                sb.append(s);
            }

            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (br != null) br.close();
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 遍历文件夹，输出文件夹下的子文件夹和文件
     *
     * @param dir
     */
    public static void travelDir(File dir) {
        /* 文件夹不存在 */
        if (!dir.exists()) {
            System.out.println("文件夹不存在");
            return;
        }

        /* 不是目录 */
        //输出文件信息
        if (!dir.isDirectory()) {
            System.out.print(dir.getName() + "\t" + dir.length() / (1024 * 1024) + "MB");
            System.out.println();
            return;
        }

        /* 遍历文件数组 */
        File[] files = dir.listFiles();
        if (files == null) {
            //System.out.println("该目录下没有子文件");
            return;
        }
        System.out.print("/" + dir.getName() + "\t" + files.length);
        System.out.println("\n-----------------------------");

        for (File f : files) {
            //递归
            travelDir(f);
        }
    }

    /**
     * 将file拷贝到dir目录中
     *
     * @param file
     * @param dir
     */
    public static void copyFile(File file, File dir) {
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }

        InputStream in = null;
        OutputStream out = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //防止覆盖
        File copyFile = new File(dir, new Date().getTime() + file.getName());
        try {
            in = new FileInputStream(file);
            bis = new BufferedInputStream(in);
            out = new FileOutputStream(copyFile);
            bos = new BufferedOutputStream(out);

            byte[] bytes = new byte[1024];
            int count = 0;
            while ((count = bis.read(bytes, 0, bytes.length)) != -1) {
                bos.write(bytes, 0, count);
            }
            System.out.println("文件复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) bis.close();
                if (in != null) in.close();
                if (bos != null) bos.close();
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 用RandomAccessFile逆序读取文本文件，仅支持纯中文或者纯英文文本
     *
     * @param file        读取的文件
     * @param FileReverse 逆序输出的文件
     */
    public static void readCharFileReverse(File file, File FileReverse) {
        //文件是否存在
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }

        //是否是文件
        if (!file.isFile()) {
            System.out.println("不是文件");
            return;
        }

        /*
        中文3个字节，英文1个字节
         */
        RandomAccessFile raf = null;
        OutputStream out = null;
        final int CHARACTER_BYTES = 1;  //1-英文，3-支持纯中文
        try {
            /*
            指针偏移到最后一个字节
            当指针>=0，设置指针到当前索引，读取当前字节，指针索引向前偏移一个字节
            */
            raf = new RandomAccessFile(file, "r");      //只读模式创建对象
            out = new FileOutputStream(FileReverse);
            long bytesNum = raf.length();       //文件字节数
            long pointerIndex = bytesNum - CHARACTER_BYTES;     //指针索引到末尾
            byte[] bytes = new byte[CHARACTER_BYTES];       //缓存字节数组

            raf.seek(pointerIndex);
            while (pointerIndex >= 0) {
                raf.seek(pointerIndex);
                raf.read(bytes);
                out.write(bytes);
                pointerIndex -= CHARACTER_BYTES;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (raf != null) raf.close();
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 按行读取文件，并显示行号
     *
     * @param file 要读取的文件
     */
    public static void readCharFileWithLine(File file) {
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }

        if (!file.isFile()) {
            System.out.println("不是文件");
            return;
        }

        Reader reader = null;
        BufferedReader br = null;

        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String s;
            int line = 0;
            while ((s = br.readLine()) != null) {
                System.out.println((++line) + " " + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 统计一个目录下文件大小小于某值文件的个数
     *
     * @param dir 目录
     * @param mb  文件大小，MB
     * @return 文件个数
     */
    public static int countFilesBySize(File dir, long mb) {
        if (!dir.exists()) {
            System.out.println("目录不存在");
            writeChartoFile(new File("D:/ss/count.log"), "目录不存在");
        }

        long b = mb * 1024 * 1024;     //字节数
        int count = 0;                 //统计个数

        /*
        如果是文件，就判断大小是否<b
        符合，count+1
        不符合，count不变
         */
        if (dir.isFile()) {
            System.out.print(dir.getName() + "\t" + dir.length() / 1024.0 / 1024.0);
            if (dir.length() < b) {
                System.out.print("\t√");
                return ++count;
            }
            System.out.print("\t×");
            return count;
        }

        /*
        如果是目录，就获取文件列表
        文件列表为空，count不变
        不为空，就遍历文件列表，对每个文件递归，递归返回的结果累加
         */
        File[] files = dir.listFiles();
        if (files == null) {
            return count;
        }
        System.out.println(dir.getName() + "/");

        for (File f : files) {
            count += countFilesBySize(f, mb);
            System.out.println("\t" + count);
        }
        System.out.println("----------EOF---------");
        return count;
    }

    /**
     * 合并文件
     *
     * @param fileList  需要合并的文件列表
     * @param mergeFile 合并后的文件
     */
    public static void mergeFiles(List<File> fileList, File mergeFile) {
        OutputStream out = null;
        byte[] bytes = new byte[512];
        try {
            out = new FileOutputStream(mergeFile);
            for (File f : fileList) {
                if (!f.exists()) {
                    System.out.println("文件" + f.getName() + "不存在");
                    return;
                }
                InputStream in = new FileInputStream(f);
                BufferedInputStream bis = new BufferedInputStream(in);
                int count = 0;
                while ((count = bis.read(bytes, 0, bytes.length)) != -1) {
                    out.write(bytes, 0, count);
                }

                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void downloadFileByUrl(String downloadUrl, File downloadDir, String fileName) {
        if (!downloadDir.exists()) {
            System.out.println("下载路径不存在，创建目录");
            System.out.println("目录创建成功？" + downloadDir.mkdirs());

        }

        if (!downloadDir.isDirectory()) {
            System.out.println("下载路径不是目录");
            return;
        }


        String ext = downloadUrl.substring(downloadUrl.lastIndexOf(".")).toLowerCase();   //文件后缀

        File downloadFile = new File(downloadDir + "/" + fileName + ext);   //创建要保存的本地文件
        System.out.println("下载地址：" + downloadUrl);
        System.out.println("本地保存的文件：" + downloadFile.getAbsoluteFile());

        /* 网络请求对象 */
        URL urlFile = null;
        HttpURLConnection httpURLConn = null;

        /* 输入输出流对象 */
        OutputStream out = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            System.out.println("连接服务器...");
            urlFile = new URL(downloadUrl);
            httpURLConn = (HttpURLConnection) urlFile.openConnection();
            httpURLConn.connect();
            bis = new BufferedInputStream(httpURLConn.getInputStream());    //通过HttpURLConnection获取输入流

            out = new FileOutputStream(downloadFile);
            bos = new BufferedOutputStream(out);

            System.out.println("连接到服务器成功");
            int fileBytes = httpURLConn.getContentLength();
            System.out.println("开始下载，文件总大小为 " + fileBytes / 1024.0 / 1024.0 + "MB");

            /* 输入流读取远程文件到buffer，输出流写buffer到本地文件 */
            byte[] buffer = new byte[1024];
            int count = 0;
            int downloadCount = 0;
            while ((count = bis.read(buffer, 0, buffer.length)) != -1) {
                bos.write(buffer, 0, count);
                //下载进度
                downloadCount += count;
                double downloadPercent = (downloadCount * 100.0) / fileBytes;
                System.out.printf("%.2f%%\n", downloadPercent);
            }
            bos.flush();
            System.out.println("文件下载完毕");

            /* 释放资源 */
            bis.close();
            bos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
