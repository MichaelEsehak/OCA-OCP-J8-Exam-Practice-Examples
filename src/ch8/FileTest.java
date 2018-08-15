/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8;

/**
 *
 * @author Michael
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        PrintR();
    }

    public static void charTest() throws FileNotFoundException, IOException {
        File fff=new File("C:\\Users\\Michael\\Documents\\NetBeansProjects\\HelloWorld\\test.txt");
        
        FileReader fr = new FileReader("C:\\Users\\Michael\\Documents\\NetBeansProjects\\HelloWorld\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:\\Users\\Michael\\Documents\\NetBeansProjects\\HelloWorld\\write.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);

            //bw.write(s);
            fw.write("\n");
        }

//        bw.close();
//        fw.close();
        //fw.
    }

    public static void byteTest() throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        // byte[] bytes=new byte[5];

        FileOutputStream fos = new FileOutputStream("write.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for (int i = 0; i < 10; i++) {
//            System.out.print((char)fis.read()+" ");
//            System.out.println((char)bis.read());
            //fos.write((char)fis.read());
            bos.write(fis.read());
        }
        bos.flush();

//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println((char)bytes[i]);
//        }
    }

    public static void printS() throws FileNotFoundException {
        PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("write.txt")));

    }

    public static void PrintR() throws IOException {
//        PrintWriter pw=new PrintWriter(System.out,true);
//        pw.println(String.valueOf("michael"));
//        Locale.setDefault(Locale.FRANCE);
//        pw.format(Locale.getDefault(),"It has rained 10.12 inches this year");
//
//        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(r.readLine());
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following: " + userInput);
        }

    }
}
