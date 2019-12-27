package code.cracker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Dictionary {

    private Map<String, String> dictionary;

    public Dictionary(List<String> keys, List<String> values) {
        this.dictionary = create(keys, values);
    }

    private Map<String, String> create(List<String> keys, List<String> values) {
        return IntStream.range(0, keys.size())
                .collect(HashMap::new,
                        (m, i) -> m.put(keys.get(i), values.get(i)),
                        Map::putAll);
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public String getValue(String key) {
        return dictionary.get(key);
    }
}
