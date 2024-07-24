package com.codingshadows.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BinaryFileOperations {
    public static void writeBinaryToFile(String filePath, byte[] data) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, data);
    }

    public static byte[] readBinaryFromFile(String filePath) throws IOException {
        // TODO read the content of the file and return a byte array containing the content
        return new byte[0];
    }
}
