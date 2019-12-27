package code.cracker;

import java.util.List;

public class DictionaryFactory {

    private List<String> alphabet;

    private List<String> decryptionKeys;

    public DictionaryFactory(ResourcesKeeper resourcesKeeper) {
            this.alphabet = resourcesKeeper.getAlphabet();
            this.decryptionKeys = resourcesKeeper.getDecryptionKeys();
    }

    public Dictionary create(String parameter) throws MyException{
        switch (parameter) {
            case "-e" :
                return new Dictionary(alphabet, decryptionKeys);
            case "-d" :
                return new Dictionary(decryptionKeys, alphabet);
            default :
                throw new MyException(String.format("This parameter <%s> don't exists.", parameter));
        }
    }
}
