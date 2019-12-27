package code.cracker;

import java.util.List;

public class ResourcesKeeper {

    private List<String> alphabet;

    private List<String> decryptionKeys;

    public ResourcesKeeper(ResourcesReader resourcesReader, String alphabetName, String decryptionName) throws MyException {
        this.alphabet = resourcesReader.read(alphabetName);
        this.decryptionKeys = resourcesReader.read(decryptionName);
        if(alphabet.size() != decryptionKeys.size())
            throw new MyException("Alphabet and decryption keys length must be same.");
    }

    public List<String> getAlphabet() {
        return alphabet;
    }

    public List<String> getDecryptionKeys() {
        return decryptionKeys;
    }
}
