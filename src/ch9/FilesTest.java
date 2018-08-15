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
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("test.txt");
        Path p2 = Paths.get("michael/tony");
        try {
//            Files.exists(p2);
//            System.out.println(Files.isSameFile(p1, p2));
//            Files.createDirectory(Paths.get("michael/mina/tony"));
//            Files.createDirectories(Paths.get("michael/mina/tony"));
//            Files.copy(p1, p2);
//            Files.copy(Files.newInputStream(p1), p2);
//
//            Files.copy(p2,new BufferedOutputStream(new PrintStream(System.out)));
//            Files.move(p1, p2);
//            Files.delete(p2.resolve(Paths.get("test.txt")));
            BufferedReader br=Files.newBufferedReader(p1);
            String s;
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
            
            List<String> lines=Files.readAllLines(p1);
            lines.stream().forEach(System.out::println);
            
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
