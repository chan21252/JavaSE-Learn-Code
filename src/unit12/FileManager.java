package unit12;

import unit12.entity.Employee;

import java.io.*;
import java.net.URI;
import java.util.Date;
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

    /**
     * 使用BufferedWriter写入文件
     *
     * @param dir
     */
    public static void useBufferedWriter(File dir, String fileName, String content) {
        if (dir.exists()) {
            File file = new File(dir, fileName);
            Writer writer = null;
            BufferedWriter bw = null;
            try {
                writer = new FileWriter(file);
                bw = new BufferedWriter(writer);
                char[] chs = content.toCharArray();
                bw.write(chs);
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
        } else {
            System.out.println("路径：" + dir + "不存在");
            System.out.println("创建目录成功？" + dir.mkdirs());
        }
    }

    /**
     * 复制target文件到dir目录
     *
     * @param target 要复制的文件
     * @param dir    复制到的目录
     */
    public static void copyFile(File target, File dir) {
        if (target.exists()) {
            if (!dir.exists()) {
                dir.mkdirs();   //如果不存在，创建目录
            }
            if (!dir.isDirectory()) {
                System.out.println("dir不是目录！");
                return;
            }
            InputStream in = null;  //输入流
            OutputStream out = null;    //输出流
            File copyFile = null; //文件副本
            try {
                in = new FileInputStream(target);

                /*
                避免文件名重复被覆盖，使用系统时间的时间戳作为文件名前缀
                 */
                copyFile = new File(dir, new Date().getTime() + "-" + target.getName());
                out = new FileOutputStream(copyFile);

                byte[] bytes = new byte[1024];
                int count = 0;
                while ((count = in.read(bytes, 0, bytes.length)) != -1) {
                    System.out.println("文件复制中...请稍后");
                    out.write(bytes, 0, count);
                }
                System.out.println("文件复制完成");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) in.close();
                    if (out != null) in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("target文件不存在！");
        }
    }

    /**
     * 将Employee对象保存到文件（序列化）
     *
     * @param employee 序列化对象
     */
    public static void javaSerializable(Employee employee, File target) {
        if (employee == null)
            return;

        /*if (!target.exists()){
            try {
                boolean bool = target.createNewFile();
                if (!bool)
                    return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        OutputStream out = null;
        ObjectOutputStream oos = null;

        try {
            out = new FileOutputStream(target);
            oos = new ObjectOutputStream(out);
            oos.writeObject(employee);  //将序列化对象写入到文件中
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * java反序列化文件
     *
     * @param target 目标文件
     */
    public static void javaDeserializable(File target) {
        if (!target.exists())
            return;

        InputStream in = null;
        ObjectInputStream ois = null;

        try {
            in = new FileInputStream(target);
            ois = new ObjectInputStream(in);
            //反序列化
            Object obj = ois.readObject();
            Employee employee = obj != null ? (Employee) obj : null;
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
