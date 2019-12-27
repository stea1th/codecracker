package code.cracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResourcesReaderTest {

    private ResourcesReader resourcesReader;

    @BeforeEach
    public void initTest() {
        resourcesReader = new ResourcesReader();
    }

    @Test
    void read() {
        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        List<String> expected = Arrays.asList(alphabet.split(" "));

        List<String> current = resourcesReader.read("alphabet");

        System.out.println(current.size());

        assertEquals(expected.get(0), current.get(0));
    }
}
