package unit12;

import java.io.*;
import java.net.URI;
import java.util.List;

/**
 * 文件管理类
 */
public class FileManager {
    /**
     * 创建文件对象
     *
     * @param uri 文件uri
     * @return File对象
     */
    public static File createFileAction(URI uri) {
        if (uri != null)
            return new File(uri);

        return null;
    }

    /**
     * 创建文件夹和文件夹内的文件
     *
     * @param dir       文件夹路径
     * @param fileNames 在dir中创建的文件
     */
    public static void createDir(String dir, List<String> fileNames) {
        File dirFile = new File(dir);

        if (!dirFile.exists()) { //目录不存在
            boolean bool = dirFile.mkdirs(); //创建目录
            if (bool) {  //目录创建成功
                for (String fileName : fileNames) {
                    File f = new File(dirFile, fileName);   //创建File对象
                    try {
                        f.createNewFile();  //新建文件
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("目录已存在");
        }
    }

    /**
     * 读取二进制文件
     *
     * @param fileName 被读取文件的路径
     */
    public static void readBitFile(String fileName) {
        /* 1. 建立要读取的文件对象 */
        File file = new File(fileName);

        /* 2. 基于文件对象建立输入流 */
        InputStream in = null;
        if (file.exists()) {
            System.out.println("文件的长度： " + Math.ceil(file.length() / 1024.0) + "KB");
            try {
                in = new FileInputStream(file);
                long count = 0;  //读取到的字节数
                byte[] bytes = new byte[4096];  //临时存储读取到的二进制数据

                /* 3. 读取文件输入流内容 */
                /*
                循环读取数据，返回-1读取到文件末尾
                每次读取到的数据放入bytes数组
                 */
                while ((count = in.read(bytes, 0, bytes.length)) != -1) {
                    String s = new String(bytes, 0, (int) count);
                    System.out.print(s);
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                /* 4. 关闭输入流 */
                try {
                    if (in != null)
                        in.close();
                    System.out.println("输入流关闭成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.err.println("文件不存在");
        }
    }

    /**
     * 字符输入流读取文本文件
     *
     * @param file 要读取的文件对象
     */
    public static void readCharFile(File file) {
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);  //基于文本文件建议的输入流
                char[] chs = new char[48];  //字符临时缓冲区
                int count = 0;
                while ((count = fileReader.read(chs, 0, chs.length)) != -1) {
                    String s = new String(chs, 0, count);
                    System.out.print(s);
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                        System.out.println("字节输入流关闭成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    /**
     * 使用文本缓冲流读取文本文件
     *
     * @param file 要读取的文件对象
     */
    public static void useBufferReader(File file) {
        FileReader read = null;     //基于文件的普通输入流
        BufferedReader br = null;   //基于某个Reader建立的字符缓冲流
        if (file.exists()) {
            try {
                read = new FileReader(file);
                br = new BufferedReader(read);

                char[] chs = new char[2048];
                int count = 0;

                while ((count = br.read(chs, 0, chs.length)) != -1) {
                    String s = new String(chs, 0, count);
                    System.out.print(s);
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null)
                        br.close();
                    System.out.println("字符缓冲流关闭成功");

                    if (read != null)
                        read.close();
                    System.out.println("字符输入流关闭成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 将字节数组的内容写入到二进制文件
     *
     * @param filePath 文件路径
     */
    public static void binaryOutputStream(String filePath) {
        String str = "start=C:\\Users\\Administrator\\Desktop\\files\\bg.jpg";
        OutputStream out = null;

        try {
            out = new FileOutputStream(filePath);
            byte[] bytes = str.getBytes();
            out.write(bytes);   //将字节数组数据写入到目标文件
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

    /**
     * 使用字节缓冲流输出写入文件
     *
     * @param file 写入文件
     */
    public static void useBufferedOutputStream(File file) {
        OutputStream out = null;
        BufferedOutputStream bs = null;
        String str = "床前明月光\n疑是地上霜\n举头望明月\n低头思故乡";
        //String str = "start=C:\\Users\\Administrator\\Desktop\\files\\bg.jpg";
        if (file.exists()) {
            try {
                out = new FileOutputStream(file.getAbsoluteFile() + "/思乡.doc");
                bs = new BufferedOutputStream(out);
                byte[] bytes = str.getBytes();
                bs.write(bytes);
                bs.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bs != null) out.close();
                    if (out != null) out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
