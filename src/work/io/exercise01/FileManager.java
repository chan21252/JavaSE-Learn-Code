package work.io.exercise01;

import java.io.*;
import java.util.ArrayList;
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
     * 逆序读取字符文件内容
     *
     * @param file 要读取的文件
     */
    public static void readCharFileReverse(File file) {
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }

        RandomAccessFile raFile = null;
        try {
            raFile = new RandomAccessFile(file, "r");
            /* 设置文件指针偏移量到文件末尾 */
            long filePointerIndex = raFile.length() - 1;
            raFile.seek(filePointerIndex);

            /* 从最后开始读取文件，读取完指针前移，直到指针为0 */
            //
            List<Character> charList = new ArrayList<>();
            //指针偏移量
            int count = 0;
            while (raFile.getFilePointer() >= 0) {
                char c = raFile.readChar();
                charList.add(c);
                count++;
                raFile.seek(filePointerIndex - count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
