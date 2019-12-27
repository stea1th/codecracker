package code.cracker;

public class ArgsParserResult {

    private String parameter;

    private String message;

    public ArgsParserResult(String parameter, String message) {
        this.parameter = parameter;
        this.message = message;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
