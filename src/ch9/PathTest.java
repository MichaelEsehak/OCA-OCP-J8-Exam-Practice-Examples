/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9;

/**
 *
 * @author Michael
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.LinkOption;



public class PathTest {

    public static void main(String[] args) throws URISyntaxException {
        //Path p = Paths.get("C:\\Users\\Michael\\Documents\\NetBeansProjects\\HelloWorld\\test.txt");
        Path p = Paths.get("C:\\Users\\Michael\\Documents\\NetBeansProjects\\HelloWorld\\test.txt");
        File ff = p.toFile();
        URI uri = p.toUri();

        String name = p.toString();
        int count = p.getNameCount();
        Path pname = p.getName(0);

        Path fileName = p.getFileName();
        Path parent = p.getParent();
        Path rooto = p.getRoot();
        //printPathInformation(p);

        boolean b = p.isAbsolute();
        Path absolute = p.toAbsolutePath();

        Path sub = p.subpath(5, 6).toAbsolutePath();

        //System.out.println(sub.toString());
        Path test1 = Paths.get("C:/mina/toma/esehak");
        Path test2 = Paths.get("D:/michael/../ayed/");
//        relative(test1, test2);
//        resolve(test1, test2);
        test2.normalize();

        Path test3=Paths.get("Michaell/../test.txt").normalize().toAbsolutePath();
       // System.out.println(test3);
        //System.out.println(sub.toAbsolutePath());
        try {
            System.out.println(test3.toRealPath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());
        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null) {
            System.out.println(" Current parent is: " + currentParent);
        }
    }

    public static void relative(Path p1, Path p2) {
        //System.out.println(p1.relativize(p1));
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));

    }

    public static void resolve(Path p1, Path p2) {
        //System.out.println(p1.relativize(p1));
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));

    }
}
