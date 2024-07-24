package homework;

import com.codingshadows.homework.TextFileOperations;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextFileOperationsTest {
    @Test
    public void testWriteAndReadTextFile() throws IOException {
        String filePath = "test.txt";
        String content = "Hello, World!";

        TextFileOperations.writeTextToFile(filePath, content);
        String readContent = TextFileOperations.readTextFromFile(filePath);

        assertEquals(content, readContent);
    }
}
