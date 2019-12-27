package code.cracker;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.util.Arrays;
import java.util.List;

public class ResourcesReader {

    private String fileName;

    private final static String DEFAULT_FILE_NAME = "default.conf";

    public ResourcesReader() {
        this.fileName = DEFAULT_FILE_NAME;
    }

    public ResourcesReader(String fileName) {
        this.fileName = fileName;
    }

    public List<String> read(String key) {

        Config config = ConfigFactory.parseResources(fileName);

        return Arrays.asList(config.getString(String.format("code.%s", key)).split(" "));
    }

}
