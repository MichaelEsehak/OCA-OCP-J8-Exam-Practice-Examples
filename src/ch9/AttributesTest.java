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
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.BasicFileAttributeView;

public class AttributesTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("test.txt");
        Files.isDirectory(p1);
        Files.isRegularFile(p1);
        Files.isSymbolicLink(p1);
        try {
            Files.isHidden(p1);
        } catch (IOException e) {
        }
        Files.isReadable(p1);
        Files.isExecutable(p1);
        try {
            Files.size(p1);
        } catch (IOException e) {
        }
        try {
            Files.getLastModifiedTime(p1);
            Files.setLastModifiedTime(p1,
                    FileTime.fromMillis(System.currentTimeMillis()));
        } catch (IOException e) {
        }
        try {
            Files.getOwner(p1);

            FileSystem fs = FileSystems.getDefault();
            UserPrincipalLookupService upls = fs.getUserPrincipalLookupService();
            UserPrincipal up = upls.lookupPrincipalByName("Administrator");
            //System.out.println(up);

            Files.setOwner(p1, Files.getOwner(p1));
        } catch (IOException e) {
        }

        try {
            BasicFileAttributes data = Files.readAttributes(p1, BasicFileAttributes.class);
            System.out.println("Is path a directory? " + data.isDirectory());
            System.out.println("Is path a regular file? " + data.isRegularFile());
            System.out.println("Is path a symbolic link? " + data.isSymbolicLink());
            System.out.println("Path not a file, directory, nor symbolic link? "
                    + data.isOther());
            System.out.println("Size (in bytes): " + data.size());
            System.out.println("Creation date/time: " + data.creationTime());
            System.out.println("Last modified date/time: " + data.lastModifiedTime());
            System.out.println("Last accessed date/time: " + data.lastAccessTime());
            System.out.println("Unique file identifier (if available): "
                    + data.fileKey());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try{
            BasicFileAttributeView bf=Files.getFileAttributeView(p1, BasicFileAttributeView.class);
            BasicFileAttributes basic=bf.readAttributes();
            FileTime ft=basic.lastModifiedTime();
            FileTime newModified=FileTime.fromMillis(ft.toMillis()+10000);
            bf.setTimes(newModified, null, null);
        }
        catch (Exception e){
        }
    }
}
