package cn.yxd.ibm0918.test.ReadOrWrite;

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
        Reader input=new FileReader(f);
        char[] c=new char[1024];

        int temp=0;
        int len=0;
        while((temp=input.read())!=-1){
            c[len]=(char) temp;
            len++;
        }
        input.close();
        System.out.println(new String(c,0,len));


        Writer out = new FileWriter(f,true);
        String str = "Hello 字符流";
        out.write(str);
        out.close();













    }


}
