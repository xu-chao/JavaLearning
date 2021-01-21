package example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 参数 null
 *
 * @author xuchao
 * @description io
 * @date 2021/1/20 10:49:38
 * @Version 1.0
 */
public class FileTest {
    // io流 input output stream
    public static void main(String args[]) throws IOException {
//          io();
        java.io.File file = new java.io.File("C:\\Users\\xucha\\Desktop\\a.txt");
        // read Example.file to console
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                System.out.println(s);
            }
        }
    }

    public static void io() throws IOException {
        java.io.File file = new java.io.File("C:\\Users\\xucha\\Desktop\\a.txt");
//        if(Example.file.isDirectory()){
//            System.out.println("是个文件夹");
//            File[] files = Example.file.listFiles();
//            System.out.println();
//        }
        if (file.exists()) {
            System.out.println("文件已经存在");
        } else {
            file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("resolve");
            printWriter.println("half");
            printWriter.println("vampire");
            printWriter.println("melody");
            printWriter.close();
        }
//        if(Example.file.isFile()){
//            System.out.println("是个文件");
//        }
    }
}
