package com.j4ware.languagefeaturesjava7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java7NewFileSystemAPI {

    public static void main(String... args) throws IOException {
        // package java.nio.file
        Path path = Paths.get("movies.txt");
        System.out.println("Number of Nodes:" + path.getNameCount());
        System.out.println("File Name:" + path.getFileName());
        System.out.println("File Root:" + path.getRoot());
        System.out.println("File Parent:" + path.getParent());

        Files.delete(path);
    }

}
