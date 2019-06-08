package work.net;

import java.io.*;
import java.net.*;

/**
 * 从网上下载一个图片到D:/xxx.jpg
 */
public class Exercise01 {
    public static void main(String[] args) {
        HttpURLConnection conn = null;
        InputStream in = null;
        OutputStream out = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            URL imageUrl = new URL("https://pic3.zhimg.com/80/v2-0787c55f6253570a6974146452db80df_hd.jpg");
            conn = (HttpURLConnection) imageUrl.openConnection();
            File imageFile = new File("D:/test.jpg");

            in = conn.getInputStream();
            out = new FileOutputStream(imageFile);
            bis = new BufferedInputStream(in);
            bos = new BufferedOutputStream(out);

            byte[] buffer = new byte[1024];
            int count;
            while ((count = bis.read(buffer, 0, buffer.length)) != -1) {
                bos.write(buffer, 0, count);
            }

            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) bos.close();
                if (bis != null) bis.close();
                if (in != null) in.close();
                if (out != null) out.close();
                if (conn != null) conn.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
