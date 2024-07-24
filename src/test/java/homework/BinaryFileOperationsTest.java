package homework;

import com.codingshadows.homework.BinaryFileOperations;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryFileOperationsTest {
    @Test
    public void testWriteAndReadBinaryFile() throws IOException {
        String filePath = "test.bin";
        byte[] data = {1, 2, 3, 4, 5};

        BinaryFileOperations.writeBinaryToFile(filePath, data);
        byte[] readData = BinaryFileOperations.readBinaryFromFile(filePath);

        assertArrayEquals(data, readData);
    }
}
