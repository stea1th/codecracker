package code.cracker;

import code.cracker.decoder.Decoder;
import code.cracker.dictionary.Dictionary;
import code.cracker.dictionary.DictionaryFactory;
import code.cracker.exceptions.MyException;
import code.cracker.parsers.ArgumentsParser;
import code.cracker.parsers.ParserResult;
import code.cracker.printers.Printer;
import code.cracker.res.ResourcesKeeper;
import code.cracker.res.ResourcesReader;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        try {
            ResourcesReader resourcesReader = new ResourcesReader();
            ResourcesKeeper resourcesKeeper = new ResourcesKeeper(resourcesReader, "alphabet", "decryption");
            DictionaryFactory dictionaryFactory = new DictionaryFactory(resourcesKeeper);

            ArgumentsParser argumentsParser = new ArgumentsParser();
            ParserResult parserResult = argumentsParser.parse(args);

            Dictionary dictionary = dictionaryFactory.create(parserResult.getParameter());

            Decoder decoder = new Decoder(dictionary, parserResult);
            printer.print(decoder.decode());

        } catch (MyException e) {
            printer.print(e.getMessage());
        }

    }
}
