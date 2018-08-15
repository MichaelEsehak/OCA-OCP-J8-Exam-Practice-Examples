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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WalkTest {

    public static void main(String[] args) {
        Path p = Paths.get("");
        try {
            //Files.walk(p).map(Path::toAbsolutePath).filter(x->x.toString().contains(".java")).forEach(System.out::println);
            
        List<Path> list=    Files.walk(p).map(Path::toAbsolutePath).filter(x->x.toString().contains("Test")).collect(Collectors.toCollection(ArrayList::new));
        list.stream().forEach(System.out::println);
        
            System.out.println("michael:"+list.get(1).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
