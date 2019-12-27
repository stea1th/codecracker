package code.cracker.decoder;

import code.cracker.parsers.ParserResult;
import code.cracker.dictionary.Dictionary;

import java.util.stream.Stream;

public class Decoder {

    private Dictionary dictionary;

    private ParserResult parserResult;

    public Decoder(Dictionary dictionary, ParserResult parserResult) {
        this.dictionary = dictionary;
        this.parserResult = parserResult;
    }

    public String decode() {
        StringBuilder stringBuilder = new StringBuilder();

        Stream.of(parserResult.getMessage().split("")).forEach(s-> {
            String sign = dictionary.getValue(s);
            stringBuilder.append(sign != null ? sign : s );
        });
        return stringBuilder.toString();
    }
}
