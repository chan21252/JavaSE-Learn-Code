package unit12;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class Test {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Administrator\\Desktop\\files\\java.data";
        File file = new File(filePath);
        /*
        无论给到的文件虚拟路径是否存储在，创建file对象，在java中一定不是null
        文件对象创建成功，并不代表文件已经在硬盘上存储
         */
        System.out.println(file == null);

        URI uri;
        //uri = URI.create("file:/C:/Users/Administrator/Desktop/files/data.java");   //注意scheme格式
        uri = URI.create("file:/C:/Users/Administrator/Desktop/files/");   //目录
        File resFile = FileManager.createFileAction(uri);
        //判断file对象的文件是否存在
        if (resFile.exists()) {
            System.out.println("文件存在");
            System.out.println("文件允许读取吗？" + resFile.canRead());
            System.out.println("文件允许写入吗？" + resFile.canWrite());

            /* 获取文件绝对路径，父路径，基本路径以及文件名称 */
            System.out.println("绝对路径：" + resFile.getAbsolutePath());
            System.out.println("父路径：" + resFile.getParent());
            System.out.println("基本路径：" + resFile.getPath());
            System.out.println("文件名：" + resFile.getName());

            /* 判断File是目录还是文件 */
            System.out.println("是一个文件吗？" + resFile.isFile());
            System.out.println("是一个目录吗？" + resFile.isDirectory());

            if (resFile.isDirectory()) {
                File[] files = resFile.listFiles();     //获取包含的子文件，文件调用返回null
                System.out.println("目录下的文件和目录个数：" + files.length);

                for (File f : files) {
                    System.out.println(f.getName());
                }
            }


            /* 删除文件 */
            //System.out.println("删除文件：" + resFile.delete());
        } else {
            System.out.println("文件不存在");
            //创建文件
            try {
                //createNewFile方法必须确保文件的父目录都存在，否则会发生IOException
                //系统找不到指定目录
                boolean bool = resFile.createNewFile();
                System.out.println("文件创建：" + bool);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //System.out.println(resFile != null);
    }
}
