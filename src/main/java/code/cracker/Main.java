package code.cracker;

public class Main {

    public static void main(String[] args) {
        try {
            ArgumentsParser argumentsParser = new ArgumentsParser();
            ArgsParserResult parserResult = argumentsParser.parse(args);

            ResourcesReader resourcesReader = new ResourcesReader();
            ResourcesKeeper resourcesKeeper = new ResourcesKeeper(resourcesReader, "alphabet", "decryption");
            DictionaryFactory dictionaryFactory = new DictionaryFactory(resourcesKeeper);
            Dictionary dictionary = dictionaryFactory.create();

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}
