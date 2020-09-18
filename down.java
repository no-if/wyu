package cn.yxd.ibm0918.work;



import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class down {
        public static void main(String[] args) {
            String url = "http://pic1.win4000.com/pic/1/5c/b19b23087f.jpg";
            String path="C:\\GBA\\pic.jpg";
            downloadPicture(url,path);

        }
        //链接url下载图片
        private static void downloadPicture(String urlList,String path) {
            URL url = null;
            try {
                url = new URL(urlList);
                DataInputStream dataInputStream = new DataInputStream(url.openStream());

                FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
                ByteArrayOutputStream output = new ByteArrayOutputStream();

                byte[] buffer = new byte[1024];
                int length;

                while ((length = dataInputStream.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                fileOutputStream.write(output.toByteArray());
                dataInputStream.close();
                fileOutputStream.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

