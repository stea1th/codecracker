package code.cracker.parsers;

import code.cracker.exceptions.MyException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArgumentsParser {

    private final static String PARAMETER = "-\\w";

    public ParserResult parse(String[] args) throws MyException {
        String parameter = findParameter(args);
        String message = createMessage(args);
        return new ParserResult(parameter, message);
    }

    private String createMessage(String[] args) {
        return IntStream.range(1, args.length).boxed().map(i-> args[i]).collect(Collectors.joining(" "));
    }

    private String findParameter(String[] args) throws MyException{
        Pattern pattern = Pattern.compile(PARAMETER);
        Matcher matcher = pattern.matcher(args[0]);
        if(matcher.matches()) {
            return matcher.group();
        } else {
            throw new MyException(String.format("<%s> false arguments begin.", args[0]));
        }
    }

}
