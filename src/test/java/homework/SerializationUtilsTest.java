package homework;

import com.codingshadows.homework.SerializableClass;
import com.codingshadows.homework.SerializationUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerializationUtilsTest {
    @Test
    public void testSerializeAndDeserializeObject() throws IOException, ClassNotFoundException {
        String filePath = "object.ser";
        SerializableClass originalObject = new SerializableClass("John Doe", 30);

        SerializationUtils.serializeObject(filePath, originalObject);
        SerializableClass deserializedObject = (SerializableClass) SerializationUtils.deserializeObject(filePath);

        assertEquals(originalObject.getName(), deserializedObject.getName());
        assertEquals(originalObject.getAge(), deserializedObject.getAge());
    }
}
